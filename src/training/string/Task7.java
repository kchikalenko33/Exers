package training.string;

//Дана строка. Нужно вывести на экран:
//второй символ строки
//подстроку из трех символов, начиная с третьего символа

public class Task7 {
    public static void main(String[] args) {
        String story = "Жили у бабуси - два веселых гуся.";

        char twoSymbol = story.charAt(1);
        System.out.println(twoSymbol);

        String substringStory = story.substring(2, 5);
        System.out.println(substringStory);
    }
}
