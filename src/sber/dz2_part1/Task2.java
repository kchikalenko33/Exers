package sber.dz2_part1;

import java.util.Scanner;

public class Task2 {
    public static boolean arraysEqual (int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 0 || n >= 100) {
            System.out.println("Ошибка: N должно быть больше 0 и меньше 100");
            return;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] <= 0 || a[i] >= 1000) {
                System.out.println("Ошибка: каждый ai должен быть больше 0 и меньше 1000");
                return;
            }
        }

        int m = scanner.nextInt();
        if (m <= 0 || m >= 100) {
            System.out.println("Ошибка: M должно быть больше 0 и меньше 100");
            return;
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
            if (b[i] <= 0 || b[i] >= 1000) {
                System.out.println("Ошибка: каждый aj должен быть больше 0 и меньше 1000");
                return;
            }
        }

        boolean result = arraysEqual(a, b);
        System.out.println(result);
    }
}
