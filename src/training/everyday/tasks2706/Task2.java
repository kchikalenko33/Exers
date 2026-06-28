package training.everyday.tasks2706;

import java.util.Arrays;

/**
 * Поиск максимума и минимума:
 * Дан массив целых чисел.
 * Найдите максимальное и минимальное значение в этом массиве.
 * Реализуйте два варианта: с использованием одного прохода по массиву и
 * с использованием стандартных методов Java.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        searchMaxAndMinInArr(arr);
        maxAndMinInArr(arr);
    }

    public static void searchMaxAndMinInArr(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("max = " + max + "; min = " + min);
    }

    public static void maxAndMinInArr(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);

        System.out.println("max = " + max + "; min = " + min);
    }
}
