package training.arrays;

import java.util.Random;

public class Tng32 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5, 10);
        int[] arr = new int[size];
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(-1000, 1000);
            sum += arr[i];
            if (arr[i] > maxValue) maxValue = arr[i];
            if (arr[i] < minValue) minValue = arr[i];
        }

        System.out.println("maxValue = " + maxValue + ", minValue = " + minValue);
    }
}
