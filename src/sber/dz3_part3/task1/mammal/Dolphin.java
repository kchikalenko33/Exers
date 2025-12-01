package sber.dz3_part3.task1.mammal;

import sber.dz3_part3.task1.feateach.Swimming;

public class Dolphin extends Mammal implements Swimming {
    @Override
    public void swim() {
        System.out.println("Быстро плавает");
    }
}
