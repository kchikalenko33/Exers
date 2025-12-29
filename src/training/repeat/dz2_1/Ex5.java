package training.repeat.dz2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {

    public static void rightShiftNewArr(int[] num, int m) {
        int n = num.length;
        int[] newNum = new int[n];
        m %= n;

        for (int i = 0; i < n; i++) {
            newNum[(i + m) % n] = num[i];
        }

        System.out.println(Arrays.toString(newNum));
    }

    public static void rightShift(int[] num, int m) {
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
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        int m = Integer.parseInt(scanner.nextLine());

        rightShiftNewArr(num, m);
        rightShift(num, m);
    }
}
