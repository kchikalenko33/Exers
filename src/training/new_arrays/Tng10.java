package training.new_arrays;

import java.util.Arrays;

public class Tng10 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        shiftRight(num, 2);
        shiftRightNewArr(num, 2);
        cyclicShiftRightInPlace(num, 2);
    }

    public static void shiftRight(int[] num, int m) {
        m %= num.length;

        for (int i = 0; i < m; i++) {
            int temp = num[num.length - 1];

            for (int j = num.length - 1; j > 0; j--) {
                num[j] = num[j - 1];
            }

            num[0] = temp;
        }

        System.out.println(Arrays.toString(num));
    }

    public static void shiftRightNewArr(int[] num, int m) {
        int n = num.length;
        int[] newNum = new int[n];
        m %= n;

        for (int i = 0; i < n; i++) {
            newNum[(i + m) % n] = num[i];
        }

        System.out.println(Arrays.toString(newNum));
    }

    public static void cyclicShiftRightInPlace(int[] num, int m) {
        int n = num.length;
        m %= n;

        if (m == 0) return;

        reverse(num, 0, n - 1);
        reverse(num, 0, m - 1);
        reverse(num, m, n - 1);

        System.out.println(Arrays.toString(num));
    }

    public static void reverse(int[] num, int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
