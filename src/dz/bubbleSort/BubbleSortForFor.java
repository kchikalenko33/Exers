package dz.bubbleSort;

public class BubbleSortForFor {
    public static void bubbleSortForFor(int[] numbers) {
        int length = numbers.length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
    }
}
