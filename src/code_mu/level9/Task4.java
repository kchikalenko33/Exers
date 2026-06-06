package code_mu.level9;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // "-x-xx-xxx-xx-x-"
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        /*int[][] {
            {1, 5},
            {2, 6},
            {3, 7},
            {4, 8}
        }*/

        int[][] res = new int[arr1.length][2];

        for (int i = 0; i < res.length; i++) {
            res[i] = new int[] {arr1[i], arr2[i]};
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
