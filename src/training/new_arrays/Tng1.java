package training.new_arrays;

import java.util.Arrays;

public class Tng1 {
    public static int[] reverseArray(int[] numbers) {
        // 1234 -> 4321
        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }
}
