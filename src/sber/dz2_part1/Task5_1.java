package sber.dz2_part1;

import java.util.Arrays;

    public class Task5_1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] number = {1,2,3,4,5};
//        int n = 2;
//
//        for (int j = 0; j < n; j++) {
//            int temp = a[0];
//
//            for (int i = 0; i < a.length - 1; i++) {
//                a[i] = a[i + 1];
//            }
//
//            a[a.length - 1] = temp;
//        }
//
//        System.out.println(Arrays.toString(a));

        shiftRight(number, 2);
        System.out.println(Arrays.toString(number));
    }

    public static void shiftRight(int[] number, int n) {
        for (int i = 0; i < n; i++) {
           int temp =  number[number.length - 1];

            for (int j = number.length - 1; j > 0; j--) {
                number[j] = number[j - 1];
            }

            number[0] = temp;
        }

    }
}
