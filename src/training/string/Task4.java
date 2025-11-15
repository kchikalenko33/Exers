package training.string;

//Дана строка, состоящая из латинских букв. Нужно создать новую строку,
//в которой каждая буква, стоящая на четной позиции (индекс 0, 2, 4, ...),
//будет заменена на символ '*'. Использовать StringBuilder для формирования результата,
//а для получения символов исходной строки — метод charAt.

import java.util.Scanner;

public class Task4 {
    public static void changeLetter (String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if(i % 2 == 0) {
                result.append('*');
            } else {
                result.append(word.charAt(i));
            }
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи слово - ");

        String word = scanner.nextLine();

        changeLetter(word);
    }
}
