package training.string;

public class Task14 {
    public static void main(String[] args) {
        String phrase = "H slf lsfg dssdgsd";

        int spaceIndex = phrase.lastIndexOf(" ");

        if (spaceIndex == -1) {
            System.out.println(phrase);
        } else {
            System.out.println(phrase.substring(0, spaceIndex));
            System.out.println(phrase.substring(spaceIndex + 1));
        }
    }
}
