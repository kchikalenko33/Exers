package skillfactory;

public class Task5 {
    public static String removeWhitespacesAndSpecialChars(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespacesAndSpecialChars("java\t\nis\tthebest"));
    }
}
