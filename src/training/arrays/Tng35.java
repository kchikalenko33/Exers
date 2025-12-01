package training.arrays;

import java.util.Random;

public class Tng35 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(5, 15);
        int[] numbers = new int[length];
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(-1000, 1000);
            sum += numbers[i];
            if (numbers[i] > maxNumber) maxNumber = numbers[i];
            if (numbers[i] < minNumber) minNumber = numbers[i];
        }

        System.out.println(sum + " " + minNumber + " " + maxNumber);
    }

}
