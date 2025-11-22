package code_mu.level1;

public class Task2_3 {
    public static void main(String[] args) {
        int number = 123;
        String s = String.valueOf(number);

        int firstDigit = Character.getNumericValue(s.charAt(0));
        int lastDigit = Character.getNumericValue(s.charAt(s.length() - 1));

        System.out.println(firstDigit+lastDigit);
    }
}
