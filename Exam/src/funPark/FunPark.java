package funPark;

import attractions.Attraction;
import attractions.TypeOfAttraction;
import beasts.Type;
import clients.Client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class FunPark {

    private String name;
    private String address;
    private ArrayList<Attraction> attractions = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();

    public FunPark(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public double totalProfit(){
        double profit = 0;
        for (int i = 0; i < attractions.size(); i++) {
            profit += this.attractions.get(i).getIncome();
        }
        return profit;
    }

    public void printAttractionWithTheMostClients(){
        int normalAttractionClients = 0;
        int extremeAttractionClient = 0;
        for (int i = 0; i < this.attractions.size(); i++) {
            if(this.attractions.get(i).getTotalNumberOfPeopleForAttraction() > normalAttractionClients &&
                    this.attractions.get(i).getTypeOfAttraction() == TypeOfAttraction.NORMAL){
                normalAttractionClients = i;
            }
            if(this.attractions.get(i).getTotalNumberOfPeopleForAttraction() > extremeAttractionClient &&
                    this.attractions.get(i).getTypeOfAttraction() == TypeOfAttraction.EXTREME){
                extremeAttractionClient = i;
            }
        }
        System.out.println("Name of normal attraction with the most clients is " + this.attractions.get(normalAttractionClients));
        System.out.println("Name of extreme attraction with the most clients is " + this.attractions.get(extremeAttractionClient));
    }

    public int printTotalNumberOfKids(){
        int totalNumberOfKids = 0;
        for (int i = 0; i < this.attractions.size(); i++) {
            totalNumberOfKids += this.attractions.get(i).getNumberOfKids();
        }
        return totalNumberOfKids;
    }

    public void clientSetAttraction(){
        for (int i = 0; i < this.clients.size(); i++) {
            int randomAttraction = new Random().nextInt(this.attractions.size());
            this.attractions.get(randomAttraction).addClientForAttraction(this.clients.get(i));
            this.attractions.get(new Random().nextInt(this.attractions.size())).addClientForAttraction(this.clients.get(i));
        }
    }

    public void startAllAttractions(){
        for (int i = 0; i < this.attractions.size(); i++) {
            this.attractions.get(i).start();
        }
    }

    public int numberOfPeopleWithBadLuck(){
        int totalNumber = 0;
        for (int i = 0; i < this.attractions.size(); i++) {
            totalNumber += this.attractions.get(i).getBeast().getNumberOfPeoplesWithBadLuck();
        }
        return totalNumber;
    }
}
