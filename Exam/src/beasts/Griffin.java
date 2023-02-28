package beasts;

import clients.Client;

public class Griffin extends AirBeast{

    private int wingspan;
    private String maneColor;

    public Griffin(String name, int age, int maxSpeedOfFlying, int wingspan, String maneColor) {
        super(name, age, maxSpeedOfFlying, false);
        this.wingspan = wingspan;
        this.maneColor = maneColor;
    }

    @Override
    public void makeANumber(Client client) {
        System.out.println("gives the customer a ride");
    }
}
