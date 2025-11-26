package training.string;

public class Task13 {
    public static void main(String[] args) {
        String phrase = "Hello world dsgsdag";

        int spaceIndex = phrase.indexOf(" ");

        if (spaceIndex == -1) {
            System.out.println(phrase);
        } else {
            System.out.println(phrase.substring(0, spaceIndex));
            System.out.println(phrase.substring(spaceIndex + 1));
        }
    }
}
