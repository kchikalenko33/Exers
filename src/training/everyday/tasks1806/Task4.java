package training.everyday.tasks1806;

public class Task4 {
    // В массиве целых чисел найдите максимальный элемент и его индекс.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        maxNumAndIndex(arr);
    }

    public static void maxNumAndIndex(int[] arr) {
        int maxNum = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("maxNum = " + maxNum + "; maxIndex = " + maxIndex + ";");
    }
}
