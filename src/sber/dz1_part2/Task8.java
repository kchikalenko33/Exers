package sber.dz1_part2;

import java.util.Scanner;

public class Task8 {
    public static void splitByLastSpace(String phrase) {
        if (phrase.length() <= 2 || phrase.length() >= 100) {
            System.out.println("Ошибка: Количество символов фразы должна быть в диапазоне от 3 до 99");
            return;
        }

        int spaceIndex = phrase.lastIndexOf(" ");

            System.out.println(phrase.substring(0, spaceIndex));
            System.out.println(phrase.substring(spaceIndex + 1));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу - ");

        String phrase = scanner.nextLine();
        splitByLastSpace(phrase);
    }

}
