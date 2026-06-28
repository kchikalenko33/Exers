package training.everyday.tasks2706;

import java.util.Arrays;

/**
 * Сдвиг элементов (Циклический сдвиг)
 * Реализуйте метод для циклического сдвига массива на 3 позиции влево.
 * Элементы, выходящие за конец массива, должны появляться в его начале.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateLeft(arr, 3)));
    }

    public static int[] rotateLeft(int[] arr, int step) {
        for (int i = 0; i < step % arr.length; i++) {
            int first = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = first;
        }

        return arr;
    }
}
