package practical_task.file10.task2.model.armor;

public class Helmet extends BaseArmor {
    public static final int HELMET_POSITION = 3;

    public Helmet(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }
}
