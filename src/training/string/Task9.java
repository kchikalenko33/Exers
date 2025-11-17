package training.string;

//Дана строка. Нужно:
//вывести каждый второй символ строки, начиная с первого (индекс 0)
//проверить, встречается ли буква 'а' в строке, и если да — вывести индекс первого вхождения
//вывести подстроку между первыми и последними появлением символа 'е' (включительно)

public class Task9 {
    public static void main(String[] args) {
        String phrase = "Это задание требует циклов для прохода по строке";

        for (int i = 0; i < phrase.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(phrase.charAt(i));
            }
        }

        for (int i = 0; i < phrase.length(); i++) {
            char symbol = phrase.charAt(i);

            if (symbol == 'а') {
                System.out.println(i);
                break;
            }
        }

        int firstIndex = -1;

        for (int i = 0; i < phrase.length(); i++) {
            char symbol = phrase.charAt(i);

            if (symbol == 'е') {
                firstIndex = i;
                break;
            }
        }
        int lastIndex = -1;

        for (int i = phrase.length() - 1; i >= 0; i--) {
            char symbol = phrase.charAt(i);

            if (symbol == 'е') {
                lastIndex = i;
                break;
            }
        }

        if (firstIndex == -1 && lastIndex == -1) {
            System.out.println("нет символа 'е'");
        } else if (firstIndex == lastIndex) {
            System.out.println(phrase.substring(firstIndex));
        } else {
            System.out.println(phrase.substring(firstIndex, lastIndex + 1));
        }
    }
}
