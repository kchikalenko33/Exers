package practical_task.file10.task2.model.hero;

import practical_task.file10.task2.model.armor.Armor;
import practical_task.file10.task2.model.item.Item;
import practical_task.file10.task2.model.weapon.Weapon;

public abstract class Hero implements Player, Inventory, Equipment, Healthy {
    protected String userName;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes;
    protected Item[] items;

    public Hero(String userName, int health) {
        if (userName == null || userName.isBlank()) {
            throw new IllegalArgumentException("Empty userName");
        }

        this.userName = userName;
        this.health = Math.min(Math.max(health, 0), Healthy.MAX_HEALTH);
        this.weapon = null;
        this.clothes = new Armor[Equipment.CLOTHES_COUNT];
        this.items = new Item[Inventory.ITEMS_COUNT];
    }

    // методы здоровья
    protected void loseHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public boolean isDied() {
        return health <= 0;
    }

    @Override
    public void recoverHealth(int value) {
        if (value <= 0 || isDied()) {
            return;
        }

        health += value;

        if (health > Healthy.MAX_HEALTH) {
            health = Healthy.MAX_HEALTH;
        }
    }

    //Player: имя и получение урона
    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public int damage(int enemyPower) {
        int rest = enemyPower;

        // броня гасит часть урона
        for (Armor armor : clothes) {
            if (armor == null || armor.isBroken()) {
                continue;
            }
            int absorbed = armor.destroyBy(rest);
            rest -= absorbed;
            if (rest <= 0) {
                break;
            }
        }

        if (rest > 0) {
            loseHealth(rest);
        }
        return rest; // фактически нанесённый по здоровью урон
    }

    //Equipment: оружие и броня
    @Override
    public boolean change(Weapon newWeapon) {
        // здесь в наследниках будешь проверять "свой" ли это тип оружия
        if (newWeapon == null) {
            return false;
        }
        this.weapon = newWeapon;
        return true;
    }

    @Override
    public void dress(Armor armor) {
        if (armor == null || armor.isBroken()) {
            return;
        }
        int pos = armor.getPosition();      // 1..3
        int index = pos - 1;
        if (index < 0 || index >= clothes.length) {
            return;
        }
        // можно заменить всегда или только если новая прочнее — на твой выбор
        clothes[index] = armor;
    }

    //Inventory: добавление и использование предметов
    @Override
    public boolean putInfo(Item item, int position) {
        int index = position - 1;
        if (index < 0 || index >= items.length || item == null) {
            return false;
        }
        items[index] = item;    // можно добавить проверку, умеет ли герой это использовать
        return true;
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

        int value = item.use();

        return value > 0;
    }

    //
    @Override
    public String toString() {
        String weaponStr = (weapon == null) ? "no" : weapon.toString();

        StringBuilder inv = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (i > 0) {
                inv.append("; ");
            }
            inv.append(items[i] == null ? "no" : items[i].toString());
        }

        return getClass().getSimpleName() + ": " + userName
                + ", health: " + health
                + ", weapon: " + weaponStr
                + ", inventory: " + inv;
    }

    @Override
    public abstract boolean action(Player enemy, int distance);

}
