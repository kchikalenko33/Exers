package dz.bubbleSort;

public class BubbleSortForWhile {
    public static void bubbleSortForWhile(int[] numbers) {
        int length = numbers.length - 1;
        for (int i = 0; i < length; i++) {
            int j = 0;

            while (j < length - i) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
                j++;
            }
        }
    }
}
