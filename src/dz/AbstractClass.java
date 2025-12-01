package dz;

public abstract class AbstractClass {
    protected String name;
    protected int age;

    protected AbstractClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void myMethod() {
        System.out.println("Привет");
    }

    abstract void start();

}
