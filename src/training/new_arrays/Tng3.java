package training.new_arrays;

import java.util.Arrays;

public class Tng3 {
    public static int[] newArray(int[] numbers, int x) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) count++;
        }

        int[] newArray = new int[numbers.length - count];

        int j = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (x != numbers[i]) {
                newArray[j] = numbers[i];
                j++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,2,4,5};
        System.out.println(Arrays.toString(newArray(numbers, 2)));
    }
}
