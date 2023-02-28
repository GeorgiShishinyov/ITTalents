package beasts;

import clients.Client;

import java.util.ArrayList;
import java.util.Random;

public class Mermaid extends WaterBeast{

    private int lengthOfHair;
    private ArrayList<Client> absorbedClients = new ArrayList<>();

    public Mermaid(String name, int age, int maxDepth, int lengthOfHair) {
        super(name, age, maxDepth, true);
        this.lengthOfHair = lengthOfHair;
    }

    private void absorbClient(Client client){
        this.absorbedClients.add(client);

    }

    @Override
    public void makeANumber(Client client) {
        System.out.println("sing a song");
        int chanceToAbsorbAClient = new Random().nextInt(100);
        if(chanceToAbsorbAClient < 10){
            System.out.println("come with meeee!!!! " + client.getName());
            setNumberOfPeoplesWithBadLuck(getNumberOfPeoplesWithBadLuck()+1);
            absorbClient(client);
        }
    }


}
