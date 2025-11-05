package sber.dz1_part2;

import java.util.Scanner;

public class TaskDop1 {
    public static void chekPassword (String password) {
        if (password.length() < 8) {
            System.out.println("пароль не прошел проверку");
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("пароль не прошел проверку");
        } else if (!password.matches(".*[a-z].*")) {
            System.out.println("пароль не прошел проверку");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("пароль не прошел проверку");
        } else if (!password.matches(".*[_*\\-].*")) {
            System.out.println("пароль не прошел проверку");
        } else {
            System.out.println("пароль надежный");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи пароль - ");
        String password = scanner.nextLine();
        chekPassword(password);
    }
}
