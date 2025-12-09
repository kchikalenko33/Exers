package practical_task.file10.task2.model.hero;


import practical_task.file10.task2.model.item.Food;
import practical_task.file10.task2.model.item.HealthPotion;
import practical_task.file10.task2.model.item.Item;
import practical_task.file10.task2.model.weapon.Weapon;

public class Barbarian extends Hero{

    private static final int MAX_STRENGTH = 100;      // MAX_STRENGTH
    private static final int BARBARIAN_FORCE = 10;    // BARBARIAN_FORCE

    private int strength;        // запас сил
    private int forcePower = 1;  // сила одного удара (множитель)

    public Barbarian(String userName, int health, int strength) {
        super(userName, health);
        this.strength = Math.min(Math.max(strength, 0), MAX_STRENGTH);
    }

    @Override
    public boolean action(Player enemy, int distance) {
        if (distance != 1 || isDied() || strength < forcePower) {
            return false;
        }

        int hit = forcePower * BARBARIAN_FORCE;
        strength -= forcePower;

        enemy.damage(hit);
        return true;
    }

    @Override
    public boolean change(Weapon weapon) {
        return false;   // игнорируем любое оружие
    }

    @Override
    public boolean useItem(int position) {
        int index = position - 1;
        if (index < 0 || index >= items.length) {
            return false;
        }
        Item item = items[index];
        if (item == null || item.isUsed()) {
            return false;
        }

        if (item instanceof Food) {
            int value = item.use();          // сколько сил даёт еда
            if (value <= 0) return false;
            strength += value;
            if (strength > MAX_STRENGTH) {
                strength = MAX_STRENGTH;
            }
            return true;
        }

        if (item instanceof HealthPotion) {
            int value = item.use();
            if (value <= 0) return false;
            recoverHealth(value);
            return true;
        }

        return false; // стрелы, мана и т.п. варвар не умеет
    }
}


