package code_mu.level9;

import java.util.Arrays;

public class Task6_1 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int dig : array[i]) {
                sb.append(dig);
            }

            res[i] = Integer.parseInt(sb.toString());
        }

        System.out.println(Arrays.toString(res));
    }
}
