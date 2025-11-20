package sber.dz3_part1.task1;

public class Cat {

    private void sleep(){
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        double value = Math.random();
        if (value < 0.35) {
            sleep();
        } else if (value < 0.65) {
            meow();
        } else {
            eat();
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.status();
    }
}
