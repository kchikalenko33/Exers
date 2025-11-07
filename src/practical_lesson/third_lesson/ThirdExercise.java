package practical_lesson.third_lesson;

import sber.dz1_part2.Task1;
import sber.dz1_part2.Task2;
import sber.dz1_part2.Task3;

public class ThirdExercise {
    public static void main(String[] args) {
        long k = 129;
        byte l = (byte) k;

        System.out.println(l);
        int i = Integer.MAX_VALUE;
        System.out.println(i);

        Object[] obj = new Object[3];
        obj[0] = new Task1();
        obj[1] = new Task2();
        obj[3] = new Task3();
    }
}
