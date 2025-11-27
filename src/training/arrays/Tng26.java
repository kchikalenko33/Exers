package training.arrays;

public class Tng26 {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 3, 1, 5, 7, 1, 9, 8};
        int[] topNumbers = {-1, -1, -1};

        for (int i = 0; i < 3; i++) {
            int topNumber = -1;

            for (int j = 0; j < numbers.length; j++) {
                boolean alreadyPicked = false;

                for (int k = 0; k < i; k++) {
                    if (numbers[j] == topNumbers[k]) {
                        alreadyPicked = true;
                    }
                }

                if (!alreadyPicked && numbers[j] > topNumber) {
                    topNumber = numbers[j];
                }
            }

            topNumbers[i] = topNumber;
        }

        System.out.println(topNumbers[0] + " " + topNumbers[1] + " " + topNumbers[2]);
    }
}
