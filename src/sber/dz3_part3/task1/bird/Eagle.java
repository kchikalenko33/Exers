package sber.dz3_part3.task1.bird;

import sber.dz3_part3.task1.feateach.Flying;

public class Eagle extends Bird implements Flying {
    @Override
    public void fly() {
        System.out.println("Летают быстро");
    }


}
