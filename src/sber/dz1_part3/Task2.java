package sber.dz1_part3;

import java.util.Scanner;

public class Task2 {
    public static void sumOfNumbers(int m, int n) {
        if (m < 0 || m > 10 || n < 0 || n > 10) {
            System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 9");
            return;
        }

        if (m < n) {
            System.out.println(m + n);
        } else {
            System.out.println("Ошибка: Первое должно быть меньше второго");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число - ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите второе число - ");
        int n = Integer.parseInt(scanner.nextLine());

        sumOfNumbers(m, n);
    }
}
