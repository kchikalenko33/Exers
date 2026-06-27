package training.everyday.tasks1806;

public class Task3 {
    // Дан массив из N целых чисел. Выведите на экран все элементы массива, которые больше своего индекса.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(countNum(arr));
    }

    public static int countNum(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) count++;
        }

        return count;
    }
}
