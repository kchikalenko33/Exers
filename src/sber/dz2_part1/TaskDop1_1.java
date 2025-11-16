package sber.dz2_part1;

import java.util.Random;
import java.util.Scanner;

public class TaskDop1_1 {
    public static String generatePassword(int lengthPassword) {
        String upperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCases = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "_*-";

        String allChars = upperCases + lowerCases + digits + specialChars;
        Random random = new Random();

        char[] password = new char[lengthPassword];

        password[0] = upperCases.charAt(random.nextInt(upperCases.length()));
        password[1] = lowerCases.charAt(random.nextInt(lowerCases.length()));
        password[2] = digits.charAt(random.nextInt(digits.length()));
        password[3] = specialChars.charAt(random.nextInt(specialChars.length()));

        for (int i = 4; i < lengthPassword; i++) {
            password[i] = allChars.charAt(random.nextInt(allChars.length()));
        }

        for (int i = password.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }

        return new String(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthPassword;

        while (true) {
            System.out.print("Введите длину пароля: ");
            lengthPassword = Integer.parseInt(scanner.nextLine());
            if (lengthPassword >= 8) {
                break;
            } else {
                System.out.println("Пароль с " + lengthPassword + " количеством символов небезопасен");
            }
        }

        System.out.println("Ваш пароль сгенерирован - " + generatePassword(lengthPassword));
    }
}
