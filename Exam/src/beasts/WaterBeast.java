package beasts;

public abstract class WaterBeast extends Beast{

    private int maxDepth;

    public WaterBeast(String name, int age, int maxDepth, boolean isBeatDangerous) {
        super(name, age, isBeatDangerous, Type.WATER_BEAST);
        this.maxDepth = maxDepth;
    }
}
