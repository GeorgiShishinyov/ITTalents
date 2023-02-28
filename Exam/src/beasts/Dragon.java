package beasts;

import clients.Client;

import java.util.ArrayList;
import java.util.Random;

public class Dragon extends AirBeast{

    private ArrayList<Client> crematedClients = new ArrayList<>();
    private int treasures = 50;

    public Dragon(String name, int age, int maxSpeedOfFlying) {
        super(name, age, maxSpeedOfFlying, true);
    }

    private void cremateAClient(Client client){
        this.crematedClients.add(client);
    }

    @Override
    public void makeANumber(Client client) {
        if(this.treasures > 0){
            System.out.println("gives a gem from his treasure");
            this.treasures--;
        }
        int chanceToCremateAClient = new Random().nextInt(100);
        if(chanceToCremateAClient < 10){
            System.out.println("cremate a client " + client.getName());
            setNumberOfPeoplesWithBadLuck(getNumberOfPeoplesWithBadLuck()+1);
            cremateAClient(client);
        }
    }
}
