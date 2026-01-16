package dz.enums;

public enum CoffeeType {

    ESPRESSO("Эспрессо", 10, 30),
    AMERICANO("Американо", 6, 200),
    CAPPUCCINO("Капучино", 4, 180),
    LATTE("Латте", 3, 250),
    MOCHA("Мокка", 5, 220);

    private final String name;
    private final int strength;
    private final int standardVolume;

    CoffeeType(String name, int strength, int standardVolume) {
        this.name = name;
        this.strength = strength;
        this.standardVolume = standardVolume;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getStandardVolume() {
        return standardVolume;
    }

    public String getDescription() {
        return String.format("%s (крепкость: %d, порция: %d)",
                name, strength, standardVolume);
    }

    public boolean isGoodForMorning() {
        return strength > 5;
    }

    @Override
    public String toString() {
        return name;
    }

    public static CoffeeType byName(String name) {
        if(name == null) {
            return null;
        }

        for (CoffeeType type : CoffeeType.values()) {
            if (type.getName().equalsIgnoreCase(name)) {
                return type;
            }
        }

        return null;
    }

    public static void printAllTypes() {
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type.getDescription());
        }
    }

    public static int countStrongCoffees() {
        int count = 0;
        for (CoffeeType type : CoffeeType.values()) {
            if (type.getStrength() > 5) {
                count++;
            }
        }
        return count;
    }

    public static CoffeeType[] getAllTypes() {
        return CoffeeType.values();
    }
}
