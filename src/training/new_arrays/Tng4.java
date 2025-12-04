package training.new_arrays;

import java.util.Arrays;

public class Tng4 {
    public static int topTwoNumber(int[] numbers) {
        int maxNumberOne, maxNumberTwo;

        if (numbers[0] > numbers[1]) {
            maxNumberOne = numbers[0];
            maxNumberTwo = numbers[1];
        } else {
            maxNumberOne = numbers[1];
            maxNumberTwo = numbers[0];
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > maxNumberOne) {
                maxNumberTwo = maxNumberOne;
                maxNumberOne = numbers[i];
            } else if (numbers[i] > maxNumberTwo && numbers[i] < maxNumberOne) {
                maxNumberTwo = numbers[i];
            }
        }

        return maxNumberTwo;
    }

    public static void main(String[] args) {
        int[] numbers = {5,5,4,3,1};
        System.out.println(topTwoNumber(numbers));
    }
}
