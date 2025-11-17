package training.string;

//Дана строка. Нужно:
//вывести первый символ строки
//проверить, совпадает ли последний символ строки с третьим символом
//вывести подстроку между вторым и предпоследним символом (не включая их)

public class Task8 {
    public static void main(String[] args) {
        String phrase = "Кабы не было зимы";
        char firstSymbol = phrase.charAt(0);
        System.out.println(firstSymbol);

        char thirdSymbol = phrase.charAt(2);
        char lastSymbol = phrase.charAt(phrase.length() - 1);

        if (thirdSymbol == lastSymbol) {
            System.out.println("Третий и последний символ равны");
        } else {
            System.out.println("Третий и последний символ не равны");
        }

        String substringPhrase = phrase.substring(2, phrase.length() - 2);
        System.out.println(substringPhrase);
    }
}
