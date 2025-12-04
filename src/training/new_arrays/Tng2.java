package training.new_arrays;

import java.util.Arrays;

public class Tng2 {
    public static int[] reverseArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }
}
