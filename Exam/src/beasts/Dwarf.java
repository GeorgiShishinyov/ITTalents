package beasts;

import clients.Client;

public class Dwarf extends EarthBeast{

    public Dwarf(String name, int age) {
        super(name, age, false);
    }

    @Override
    public void makeANumber(Client client) {
        System.out.println("forge a gem ring and give it");
    }
}
