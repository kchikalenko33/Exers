package practical_task.file10.task2.model.weapon;

import practical_task.file10.task2.model.armor.BaseArmor;

public class Bow extends BaseWeapon {
    public static final int BOW_DISTANCE = 5;

    public Bow(int durability) {
        super(durability);
    }

    @Override
    public int getDistance() {
        return BOW_DISTANCE;
    }
}
