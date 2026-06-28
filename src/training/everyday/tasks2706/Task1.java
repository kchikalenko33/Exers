package training.everyday.tasks2706;

import java.util.Arrays;

/**
 * Перевернуть массив:
 * Напишите метод, который принимает массив целых чисел и возвращает новый массив с элементами в обратном порядке.
 * Исходный массив не должен изменяться.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }

        return res;
    }
}
