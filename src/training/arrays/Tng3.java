package training.arrays;

import java.util.Arrays;

public class Tng3 {

    public static void main(String[] args) {
       final int[] numbers = new int[5];

        System.out.println(Arrays.toString(numbers));

        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));

        int [][] matrix = {
                {1,2,3},
                {5,6,7,6},
                {8,9,10}
        };

        int[][] mtr = new int[3][];
        mtr[0] = new int[]{1,2,3,9,6};
        mtr[1] = new int[]{3,5,6};
        mtr[2] = new int[]{7,8,9};

        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < mtr[i].length; j++) {
                System.out.print(mtr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
