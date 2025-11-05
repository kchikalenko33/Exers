package sber.dz1_part2;

import java.util.Scanner;

public class Task9 {
    public static void splitBySecondSpace (String phrase) {
        if(phrase.length() <= 2 || phrase.length() >= 100) {
            System.out.println("Ошибка: Количество символов фразы должна быть в диапазоне от 3 до 99");
            return;
        }

        int firstSpaceIndex = phrase.indexOf(" ");
        int secondSpaceIndex = phrase.indexOf(" ", firstSpaceIndex + 1);

        if (firstSpaceIndex == -1) {
            System.out.println(phrase);
        } else {
            System.out.println(phrase.substring(0,secondSpaceIndex));
            System.out.println(phrase.substring(secondSpaceIndex + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи фразу - ");

        String phrase = scanner.nextLine();

        splitBySecondSpace(phrase);
    }
}
