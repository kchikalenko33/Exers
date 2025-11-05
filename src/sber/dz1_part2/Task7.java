package sber.dz1_part2;

import java.util.Scanner;

public class Task7 {
    public static void splitByFirstSpace(String phrase) {
        if (phrase.length() < 2 || phrase.length() > 100) {
            System.out.println("Ошибка: Количество символов фразы должна быть в диапазоне от 3 до 99");
            return;
        }

        if (phrase.charAt(0) == ' ' || phrase.charAt(phrase.length() - 1) == ' ') {
            System.out.println("Ошибка: Первый и последний символы не должны быть пробелами");
            return;
        }

        if (!phrase.contains(" ")) {
            System.out.println("Ошибка: Строка должна содержать хотя бы один пробел");
            return;
        }

        int spaceIndex = phrase.indexOf(" ");
        if (spaceIndex == -1) {
            System.out.println(phrase);
        } else {
            System.out.println(phrase.substring(0, spaceIndex));
            System.out.println(phrase.substring(spaceIndex + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу - ");

        String phrase = scanner.nextLine();
        Task7.splitByFirstSpace(phrase);
    }

}
