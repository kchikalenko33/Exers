package sber.dz1_part3;

import java.util.Scanner;

public class Task6 {
    public static void exchangeOfBanknotes(int n) {
        if (n < 0 || n > 1000000) {
            System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 999999");
            return;
        }

        int count8 = n / 8;
        n %= 8;

        int count4 = n / 4;
        n %= 4;

        int count2 = n / 2;
        n %= 2;

        int count1 = n;

        System.out.println(count8 + " " + count4 + " " + count2 + " " + count1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число - ");
        int n = Integer.parseInt(scanner.nextLine());
        exchangeOfBanknotes(n);
    }
}
