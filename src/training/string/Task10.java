package training.string;

//Дана строка. Нужно:
//вывести длину строки
//проверить, начинается ли строка с подстроки "Это"
//проверить, заканчивается ли строка на символ '.' (точка)
//заменить в строке все пробелы на символ '-' и вывести результат
//вывести строку в верхнем регистре

public class Task10 {
    public static void main(String[] args) {
        String phrase = "вывести строку в верхнем регистре";

        System.out.println(phrase.length());
        System.out.println(phrase.startsWith("Это"));
        System.out.println(phrase.endsWith("."));
        System.out.println(phrase.replace(' ', '-'));
        System.out.println(phrase.toUpperCase());
    }
}

