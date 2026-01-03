package training.new_arrays;

import java.util.Arrays;

public class Tng9 {
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

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        shiftRight(num, 2);
    }
}
