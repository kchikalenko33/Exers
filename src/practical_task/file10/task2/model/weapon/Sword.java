package practical_task.file10.task2.model.weapon;

public class Sword extends BaseWeapon{
    public static final int SWORD_DISTANCE = 2;

    public Sword(double power) {
        super(power);
    }

    @Override
    public int getDistance() {
        return SWORD_DISTANCE;
    }
}
