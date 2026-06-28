package training.everyday.tasks2706;

/**
 * Сумма и среднее арифметическое:
 * Вычислите сумму всех элементов массива и среднее арифметическое.
 * Учтите возможность пустого массива.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumAndAvgInArr(arr);
    }

    public static void sumAndAvgInArr(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        System.out.println("sum = " + sum + "; avg = " + sum / arr.length);
    }
}
