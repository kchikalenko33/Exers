package practical_task.file10.task2.model.armor;

public class Boots extends BaseArmor{
    public static final int BOOTS_POSITION = 1;

    public Boots(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return BOOTS_POSITION;
    }
}
