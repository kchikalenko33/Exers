package training.new_arrays;

import java.util.Random;

public class Tng6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0;
        double avg;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1,100);
            sum += numbers[i];
        }

        avg = (double) sum / 10;

        System.out.println("sum = " + sum + ", avg = " + avg);

    }
}
