package code_mu.level1;

import java.util.Arrays;

public class Task3_1 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int value = 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value++;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
