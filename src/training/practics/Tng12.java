package training.practics;

import java.util.Random;

public class Tng12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(4000)];
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(4000);
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }

        System.out.println("макс. длина - " + maxLength);
    }
}
