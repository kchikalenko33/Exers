package training.practics;

import java.util.Random;

public class Tng13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(3200)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(3200);
        }

        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println(maxNumber);
    }
}
