package training.string;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String name = "Kirill";
        System.out.println(name.length());

        System.out.println(name.charAt(3));

        String twoName = "Kirill";
        System.out.println(name.equals(twoName));

        String phrase = "Как дела?";
        System.out.println(phrase.toLowerCase(Locale.ROOT));
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.toUpperCase());

        System.out.println(phrase.substring(0,3));

        System.out.println(phrase.startsWith("Ка"));

        System.out.println(phrase.endsWith("?"));

        System.out.println(phrase.indexOf('к'));
        System.out.println(phrase.indexOf('и'));

        String up = "       djhgkjsdkgjhsdajkgjk dfgfd   ";
        System.out.println(up.trim());
    }
}
