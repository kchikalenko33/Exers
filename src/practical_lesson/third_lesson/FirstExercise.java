package practical_lesson.third_lesson;

import java.util.Arrays;

public class FirstExercise {
    public static void main(String[] args) {
        Object object = new String("привет");

        if (object instanceof String) {
            String s = (String) object; // downcasting
            System.out.println(s);
        }

        byte b = 10;
        int bi = b;

        short a = (short) bi;

        long ai = a;


    }
}
