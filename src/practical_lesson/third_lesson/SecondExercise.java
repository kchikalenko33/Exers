package practical_lesson.third_lesson;

import sber.dz1_part2.Task1;

public class SecondExercise {
    public static void main(String[] args) {
        Object object = new Task1();

//        if (object instanceof String) {
            String s = (String) object; // downcasting
            System.out.println(s);
//        }
        byte a = (byte) 128;
        int b = 1000;
        short bi = (short) b;

        int d = bi;

        short c = (short) d;

        long k = 1000;
        byte l = (byte) k;

        System.out.println(l);

    }
}
