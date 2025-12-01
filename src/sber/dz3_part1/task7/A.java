package sber.dz3_part1.task7;

public interface A {
    default void info(String message) {
        System.out.println("hello");
    }

    static void printBuy(String message) {
        System.out.println("Buy");
    }
}
