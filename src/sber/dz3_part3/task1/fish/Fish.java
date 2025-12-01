package sber.dz3_part3.task1.fish;

import sber.dz3_part3.task1.Animal;
import sber.dz3_part3.task1.feateach.Swimming;

public abstract class Fish extends Animal implements Swimming {
    @Override
    public void wayOfBirth() {
        System.out.println("Мечут икру");
    }
}
