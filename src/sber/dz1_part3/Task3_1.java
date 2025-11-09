package sber.dz1_part3;

import java.util.Scanner;

public class Task3_1 {
    public static void sumOfPowers(int m, int n) {
        if (m < 0 || m > 10 || n < 0 || n > 10) {
            System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 9");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(m,i);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число - ");
        int m = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите второе число - ");
        int n = Integer.parseInt(scanner.nextLine());

        sumOfPowers(m, n);
    }
}
