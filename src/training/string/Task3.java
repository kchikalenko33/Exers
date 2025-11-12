package training.string;

//Напиши программу, которая принимает на вход строку с несколькими словами, разделёнными пробелами или запятыми. Программа должна:
//Удалить пробелы в начале и конце строки (trim).
//Привести всю строку к нижнему регистру (toLowerCase).
//Разбить строку на отдельные слова по разделителям пробел или запятая (split).
//Заменить в каждом слове все буквы 'а' на 'о' (replace).
//Соединить все обработанные слова обратно в одну строку через пробел (concat или String.join).
//Вывести полученную итоговую строку.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String phrase = " Привет, дружочек, как дела?     ";

        phrase = phrase.trim();

        phrase = phrase.toLowerCase();

        String[] words = phrase.split("[,\\s]+");

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace('а','о');
        }

        String results = String.join(" ", words);
        System.out.println(results);
    }
}
