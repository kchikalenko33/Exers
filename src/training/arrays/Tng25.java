package training.arrays;

public class Tng25 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 4, 9, 1, 4, 5, 7, 4, 6};
        int[] topIndex = {-1, -1, -1};

        for (int i = 0; i < 3; i++) {
            int maxNumber = -1;
            int maxIndex = -1;

            for (int j = 0; j < numbers.length; j++) {
                boolean alreadyPicked = false;

                for (int k = 0; k < i; k++) {
                    if (topIndex[k] == j) {
                        alreadyPicked = true;
                    }
                }

                if (!alreadyPicked && numbers[j] > maxNumber) {
                    maxNumber = numbers[j];
                    maxIndex = j;
                }
            }

            topIndex[i] = maxIndex;
        }

        System.out.println(topIndex[0] + " " + topIndex[1] + " " + topIndex[2]);
    }
}
