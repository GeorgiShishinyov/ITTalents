package clients;

import attractions.Attraction;

public class Client {

    private String name;
    private double money = 200;
    private int age;
    private Gender gender;
    private TypeOfClient typeOfClient;

    public Client(String name, int age, Gender gender) {
        this.name = name;
        if(age >= 0 && age <= 80){
            this.age = age;
        }
        this.gender = gender;
        if(age < 18){
            this.typeOfClient = TypeOfClient.KID;
        }else if(age < 60){
            this.typeOfClient = TypeOfClient.OLD;
        }else{
            this.typeOfClient = TypeOfClient.RETIRED;
        }
    }

    public double getMoney() {
        return money;
    }

    public void pay(Attraction attraction){
        if(this.typeOfClient == TypeOfClient.KID){
            this.money -= attraction.getPrice()/2;
            attraction.addMoney(attraction.getPrice()/2);
        }else if(this.typeOfClient == TypeOfClient.RETIRED){
            this.money -= attraction.getPrice() * 0.8;
            attraction.addMoney(attraction.getPrice() * 0.8);
        }else {
            this.money -= attraction.getPrice();
            attraction.addMoney(attraction.getPrice());
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public TypeOfClient getTypeOfClient() {
        return typeOfClient;
    }
}
