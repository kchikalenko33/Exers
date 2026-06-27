package training.everyday.tasks1806;

import java.util.Arrays;

public class Task1 {
    //Дан одномерный массив целых чисел. Найдите сумму всех элементов массива.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(sumArr(arr));

    }

    public static int sumArr(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
