package dz.try_catch;

import dz.abstract_package.Flyable;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        Flyable.super.fly();
    }


    public static void myMethod() {

    }

}
