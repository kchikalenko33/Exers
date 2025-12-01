package sber.dz3_part3.task1.mammal;

import sber.dz3_part3.task1.feateach.Flying;

public class Bat extends Mammal implements Flying {
    @Override
    public void fly() {
        System.out.println("Летает медленно");
    }
}
