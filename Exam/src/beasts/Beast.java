package beasts;

import clients.Client;

import java.util.Objects;

public abstract class Beast {

    private String name;
    private int age;
    private boolean isBestDangerous;
    private int id;
    private static int uniqueId = 1;
    private Type type;
    protected int numberOfPeoplesWithBadLuck = 0;

    public Beast(String name, int age, boolean isBestDangerous, Type type) {
        this.name = name;
        this.age = age;
        this.id = uniqueId++;
        this.isBestDangerous = isBestDangerous;
        this.type = type;
    }

    public int getNumberOfPeoplesWithBadLuck() {
        return numberOfPeoplesWithBadLuck;
    }

    public void setNumberOfPeoplesWithBadLuck(int numberOfPeoplesWithBadLuck) {
        this.numberOfPeoplesWithBadLuck = numberOfPeoplesWithBadLuck;
    }

    public Type getType() {
        return type;
    }

    public abstract void makeANumber(Client client);

    public boolean isBestDangerous() {
        return isBestDangerous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beast beast = (Beast) o;
        return id == beast.id && Objects.equals(name, beast.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
