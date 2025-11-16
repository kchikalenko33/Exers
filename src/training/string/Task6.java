package training.string;

//Программа получает на вход строку от пользователя. Нужно вывести первый и последний символ строки,
//а также подстроку, которая содержит все символы между ними.

public class Task6 {
    public static void main(String[] args) {
        String phrase = "И биться сердце перестало";
        char oneSymbol = phrase.charAt(0);
        char lastSymbol = phrase.charAt(phrase.length() - 1);

        System.out.println(oneSymbol);
        System.out.println(lastSymbol);

        String substringPhrase = phrase.substring(1, phrase.length() - 1);
        System.out.println(substringPhrase);
    }
}
