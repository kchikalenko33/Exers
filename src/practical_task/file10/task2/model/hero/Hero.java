package practical_task.file10.task2.model.hero;

import practical_task.file10.task2.model.armor.Armor;
import practical_task.file10.task2.model.item.Item;
import practical_task.file10.task2.model.weapon.Weapon;

public abstract class Hero {
    protected String userName;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes;
    protected Item[] items;


}
