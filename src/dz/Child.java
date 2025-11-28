package dz;

public abstract class Child extends AbstractClass {
    protected String surname;

    public Child(String name, int age, String surname) {
        super(name, age);
        this.surname = surname;
    }

    @Override
    public void start() {
        System.out.println("Пока");
    }
}
