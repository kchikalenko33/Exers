package practical_task.file10.task2.model.hero;

import practical_task.file10.task2.model.armor.Armor;
import practical_task.file10.task2.model.weapon.Weapon;

public interface Equipment {
    int CLOTHES_COUNT = 3;

    boolean change (Weapon weapon);
    void dress (Armor armor);
}
