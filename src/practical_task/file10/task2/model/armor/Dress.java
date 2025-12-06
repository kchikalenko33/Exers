package practical_task.file10.task2.model.armor;

public class Dress extends BaseArmor {
    public static final int DRESS_POSITION = 2;

    public Dress(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return DRESS_POSITION;
    }
}
