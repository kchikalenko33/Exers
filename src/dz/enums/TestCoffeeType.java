package dz.enums;

public class TestCoffeeType {
    public static void main(String[] args) {
        CoffeeType espresso = CoffeeType.ESPRESSO;
        System.out.println(espresso.getName());
        System.out.println(espresso.getDescription());
        System.out.println(espresso.isGoodForMorning());
        System.out.println(espresso);

        CoffeeType cappuccino = CoffeeType.byName("капучино");
        System.out.println(cappuccino);


        CoffeeType[] all = CoffeeType.getAllTypes();
        System.out.println(all.length); // 5

        CoffeeType.printAllTypes();

        int strongCount = CoffeeType.countStrongCoffees();
        System.out.println("Крепких видов кофе: " + strongCount);
    }
}
