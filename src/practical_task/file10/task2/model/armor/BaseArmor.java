package practical_task.file10.task2.model.armor;

public abstract class BaseArmor implements Armor {
    protected int durability;

    protected BaseArmor(int durability) {
        this.durability = durability;
    }

    @Override
    public boolean isBroken() {
        return durability < 0;
    }

    @Override
    public int destroyBy(int damage) {
        durability -= damage;
        durability = Math.max(durability, 0);
        return durability;
    }

    @Override
    public String toString() {
        return getPosition() + ": " +
                getClass().getSimpleName() +
                ", durability: " + durability +
                ", isBroken: " + isBroken();
    }
}
