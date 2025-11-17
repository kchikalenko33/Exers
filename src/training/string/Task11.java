package training.string;

//Дана строка. Нужно:
//вывести длину исходной строки
//вывести строку без пробелов (используй replace)
//проверить, содержит ли строка подстроку "строка" (используй contains)
//вывести индекс первого и последнего вхождения буквы 'т' (используй indexOf и lastIndexOf)
//вывести строку без первого и последнего символа (используй substring)
//вывести исходную строку, заменив все вхождения буквы 'а' на заглавную букву 'А' (используй replace)

public class Task11 {
    public static void main(String[] args) {
        String phrase = "вывести исходную строку, заменив все вхождения буквы 'а' " +
                "на заглавную букву 'А' (используй replace)";

        System.out.println(phrase.length());
        System.out.println(phrase.replaceAll(" ", ""));
        System.out.println(phrase.contains("абвгд"));
        System.out.println(phrase.indexOf('т'));
        System.out.println(phrase.lastIndexOf('т'));
        System.out.println(phrase.substring(1,phrase.length() - 1));
        System.out.println(phrase.replace('а', 'А'));
    }
}
