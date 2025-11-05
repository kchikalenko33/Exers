package practical_lesson.second_lesson;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int results = 0;

        while (scanner.hasNextInt()) {
            results += scanner.nextInt();
        }

        System.out.println(results);
    }
}
