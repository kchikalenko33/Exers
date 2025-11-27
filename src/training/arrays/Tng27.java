package training.arrays;

public class Tng27 {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 3, 1, 5, 7, 1, 9, 8};

        int max1 = -1;
        int max2 = -1;
        int max3 = -1;

        for (int n : numbers) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2 && n != max1) {
                max3 = max2;
                max2 = n;
            } else if (n > max3 && n != max1 && n != max2) {
                max3 = n;
            }
        }

        int[] maxNumbers = {max1, max2, max3};

        System.out.println(maxNumbers[0] + " " + maxNumbers[1] + " " + maxNumbers[2]);
    }
}
