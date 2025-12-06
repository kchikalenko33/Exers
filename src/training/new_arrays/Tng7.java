package training.new_arrays;

import java.util.Random;

public class Tng7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[8];
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int countNull = 0;
        int countMinus = 0;
        int countPlus = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-50, 50);
            if (numbers[i] > maxNumber) maxNumber = numbers[i];
            if (numbers[i] < minNumber) minNumber = numbers[i];
            if (numbers[i] == 0) countNull++;
            else if (numbers[i] < 0) countMinus++;
            else countPlus++;
        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(countNull);
        System.out.println(countMinus);
        System.out.println(countPlus);
    }
}

