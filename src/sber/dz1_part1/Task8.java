package sber.dz1_part1;

import java.util.Scanner;

public class Task8 {
    public static double dailyBudget(double money) {
        return money / 30;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи бюджет - ");
        double money = Double.parseDouble(scanner.nextLine());

        if (money < 1 || money >= 100000) {
            System.out.println("Ошибка");
            return;
        }

        System.out.println(dailyBudget(money));
    }
}
