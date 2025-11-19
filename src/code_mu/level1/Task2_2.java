package code_mu.level1;

public class Task2_2 {
    public static void main(String[] args) {
        int number = -865;
        String stringNumber = String.valueOf(Math.abs(number));
        char charNumber = stringNumber.charAt(stringNumber.length()-1);
        int lastDigit = charNumber - '0';
        System.out.println(lastDigit);

        int value = 124;
        int lastValue = value % 10;
        System.out.println(lastValue);
    }
}
