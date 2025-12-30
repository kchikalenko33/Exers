package training.repeat.dz2_1;

import java.util.Arrays;

public class Ex5_2 {
    public static void shiftLeft(int[] num, int m) {
        m %= num.length;

        for (int i = 0; i < m; i++) {
            int temp = num[0];
            for (int j = 1; j < num.length; j++) {
                num[j - 1] = num[j];
            }
            num[num.length - 1] = temp;
        }

        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        shiftLeft(num, 2);
        shiftLeftNewArr(num, 2);
        cyclicShiftLeftInPlace(num, 2);
    }

    public static void shiftLeftNewArr(int[] num, int m) {
        int n = num.length;
        m %= n;
        int[] newNum = new int[n];

        for (int i = 0; i < n; i++) {
            newNum[(i - m + n) % n] = num[i];
        }

        System.out.println(Arrays.toString(newNum));
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

    public static void cyclicShiftLeftInPlace(int[] num, int m) {
        int n = num.length;
        m %= n;
        if (m == 0) return;

        reverse(num, 0, n - 1);
        reverse(num, 0, n - 1 - m);
        reverse(num, n - m, n - 1);

        System.out.println(Arrays.toString(num));
    }
}
