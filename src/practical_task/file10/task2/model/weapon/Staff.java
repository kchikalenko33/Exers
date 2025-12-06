package practical_task.file10.task2.model.weapon;

public class Staff extends BaseWeapon {

    public static final int STAFF_DISTANCE = 3;

    public Staff(double power) {
        super(power);
    }

    @Override
    public int getDistance() {
        return STAFF_DISTANCE;
    }
}
