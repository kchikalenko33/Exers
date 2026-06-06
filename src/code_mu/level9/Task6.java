package code_mu.level9;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] res1 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int res = 0;
            for (int dig : array[i]) {
                res = res * 10 + dig;
            }
            res1[i] = res;
        }

        System.out.println(Arrays.toString(res1));
    }
}
