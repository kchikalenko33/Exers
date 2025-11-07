package sber.dz1_part3;

import java.util.Scanner;

public class Task7 {
    public static void countNonSpaceChars(String s) {
        if (s.isEmpty() || s.length() > 1000) {
            System.out.println("Ошибка: Длина символов должна быть в диапазоне от 1 до 999");
            return;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу - ");

        String s = scanner.nextLine();
        countNonSpaceChars(s);
    }
}
