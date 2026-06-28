package training.everyday.tasks2706;

import java.util.Arrays;

/**
 * Сдвиг элементов (Циклический сдвиг)
 * Реализуйте метод для циклического сдвига массива на 3 позиции вправо.
 * Элементы, выходящие за конец массива, должны появляться в его начале.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(rotateRight(arr, 3)));
    }

    public static int[] rotateRight(int[] arr, int step) {
        for (int i = 0; i < step % arr.length; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

}
