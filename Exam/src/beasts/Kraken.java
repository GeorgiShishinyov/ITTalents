package beasts;

import clients.Client;

public class Kraken extends WaterBeast{

    private int lengthOfTentacle;

    public Kraken(String name, int age, int maxDepth, int lengthOfTentacle) {
        super(name, age, maxDepth, false);
        this.lengthOfTentacle = lengthOfTentacle;
    }

    @Override
    public void makeANumber(Client client) {
        System.out.println("gives a pearl on client");
    }
}
