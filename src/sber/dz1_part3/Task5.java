package sber.dz1_part3;

import java.util.Scanner;

public class Task5 {
    public static void remainderOfDivision (int m, int n) {

        if (m < 0 || m > 10 || n < 0 || n > 10) {
            System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 9");
            return;
        }

        int divider = m / n;

        int total = divider * n;

        int remainder = m - total;

        System.out.println(remainder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первое число - ");
        int m = scanner.nextInt();

        System.out.print("Введи второе число - ");
        int n = scanner.nextInt();

        remainderOfDivision(m, n);
    }
}
