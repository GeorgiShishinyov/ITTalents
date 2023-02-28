package beasts;

import clients.Client;

import java.util.ArrayList;
import java.util.Random;

public class Devil extends EarthBeast{

    private ArrayList<Client> takenSoulsOfClients = new ArrayList<>();

    public Devil(String name, int age) {
        super(name, age, true);
    }

    private void takeSouls(Client client){
        this.takenSoulsOfClients.add(client);
    }

    @Override
    public void makeANumber(Client client) {
        System.out.println("fulfills a client's wish");
        int chanceToGetSoul = new Random().nextInt(10);
        if(chanceToGetSoul == 0){
            System.out.println("take a soul of " + client.getName());
            setNumberOfPeoplesWithBadLuck(getNumberOfPeoplesWithBadLuck()+1);
            takeSouls(client);
        }
    }
}
