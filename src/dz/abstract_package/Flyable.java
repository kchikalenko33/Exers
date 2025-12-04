package dz.abstract_package;

public interface Flyable {
    int MY = 10;

     default void fly() {
         System.out.println("Ты летишь!");
     }

    static void myMethod() {
        System.out.println("Hello");
    }
}
