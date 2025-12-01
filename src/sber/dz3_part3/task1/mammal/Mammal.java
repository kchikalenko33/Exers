package sber.dz3_part3.task1.mammal;

import sber.dz3_part3.task1.Animal;

public abstract class Mammal extends Animal {
    @Override
    public void wayOfBirth() {
        System.out.println("Рождаются живородящими");
    }
}
