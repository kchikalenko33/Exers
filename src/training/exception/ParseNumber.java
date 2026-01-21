package training.exception;

public class ParseNumber {
    public static int parseNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("не верный формат числа: " + str);
            return 0;
        }
    }

    public static void main(String[] args) {
        String notNum = "df10";
        System.out.println(parseNumber(notNum));
    }
}
