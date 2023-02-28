package beasts;

public abstract class EarthBeast extends Beast{

    public EarthBeast(String name, int age, boolean isBeatDangerous) {
        super(name, age, isBeatDangerous, Type.EARTH_BEAST);
    }
}
