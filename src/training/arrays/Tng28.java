package training.arrays;

public class Tng28 {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 3, 1, 5, 7, 1, 9, 8};
        int[] topIndexes = {-1, -1, -1};

        for (int i = 0; i < 3; i++) {
            int maxNumber = Integer.MIN_VALUE;
            int maxIndex = Integer.MAX_VALUE;

            other:
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < i; k++) {
                    if (topIndexes[k] == j) {
                        continue other;
                    }
                }

                if (numbers[j] > maxNumber) {
                    maxNumber = numbers[j];
                    maxIndex = j;
                }
            }

            topIndexes[i] = maxIndex;
        }

        System.out.println(topIndexes[0] + " " + topIndexes[1] + " " + topIndexes[2]);
    }
}
