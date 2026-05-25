package record.example3;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("MacBook Pro", 1999.99, "Electronics");

        System.out.println(laptop.getFormattedInfo());


        System.out.println(laptop.isExpensive());
        System.out.println(laptop.name());
    }
}
