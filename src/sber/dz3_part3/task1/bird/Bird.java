package sber.dz3_part3.task1.bird;

import sber.dz3_part3.task1.Animal;

public abstract class Bird extends Animal {
    @Override
    public void wayOfBirth() {
        System.out.println("Откладывают яйца");
    }
}
