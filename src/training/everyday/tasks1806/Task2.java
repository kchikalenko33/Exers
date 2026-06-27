package training.everyday.tasks1806;

public class Task2 {
    // В одномерном массиве целых чисел определите количество отрицательных элементов.
    public static void main(String[] args) {
        int[] arr = {1, -2, 0, -4, 5};

        System.out.println(countNegativeNum(arr));
    }

    public static int countNegativeNum(int[] arr) {
        int count = 0;

        for (int j : arr) {
            if (j <= 0) count++;
        }

        return count;
    }
}
