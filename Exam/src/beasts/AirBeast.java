package beasts;

public abstract class AirBeast extends Beast{

    private int maxSpeedOfFlying;

    public AirBeast(String name, int age, int maxSpeedOfFlying, boolean isBeatDangerous) {
        super(name, age, isBeatDangerous, Type.AIR_BEAST);
        this.maxSpeedOfFlying = maxSpeedOfFlying;
    }
}
