package attractions;

import beasts.Beast;
import clients.Client;
import clients.TypeOfClient;
import funPark.FunPark;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Attraction{

    private String name;
    private double income = 0;
    private double price;
    private Queue<Client> clients = new LinkedList<Client>();
    private Beast beast;
    private TypeOfAttraction typeOfAttraction;
    private FunPark funPark;
    private int id;
    private static int uniqueId = 1;
    private int numberOfKids = 0;
    private int totalNumberOfPeopleForAttraction = 0;

    public Attraction(String name, Beast beast, FunPark funPark) {
        this.name = name;
        this.beast = beast;
        if(beast.isBestDangerous()){
            this.typeOfAttraction = TypeOfAttraction.EXTREME;
            this.price = 10;
        }else{
            this.typeOfAttraction = TypeOfAttraction.NORMAL;
            this.price = 5;
        }
        this.funPark = funPark;
        this.id = uniqueId++;
    }
    public Beast getBeast() {
        return beast;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void addMoney(double income) {
        this.income += income;
    }

    public double getIncome() {
        return income;
    }

    public TypeOfAttraction getTypeOfAttraction() {
        return typeOfAttraction;
    }

    public void addClientForAttraction(Client client){
        if(client.getTypeOfClient() == TypeOfClient.KID && this.typeOfAttraction == TypeOfAttraction.EXTREME){
            System.out.println("Sorry kid grow up. You are " + client.getAge());
        }else {
            if(client.getTypeOfClient() == TypeOfClient.KID){
                this.numberOfKids++;
            }
            if(client.getMoney() - this.price > 0) {
                client.pay(this);
                this.clients.offer(client);
                this.totalNumberOfPeopleForAttraction++;
            }else{
                System.out.println("You don't have money");
            }
        }
    }

    public int getTotalNumberOfPeopleForAttraction() {
        return totalNumberOfPeopleForAttraction;
    }

    public double getPrice() {
        return price;
    }

    public void start(){
        while(this.clients.size() > 0) {
            this.beast.makeANumber(this.clients.poll());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attraction that = (Attraction) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                "id=" + id +
                '}';
    }
}
