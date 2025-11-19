package code_mu.level1;

public class Task2_1 {
    public static void main(String[] args) {
        int number = -76;
        String stringNumber = String.valueOf(Math.abs(number));
        char charNumber = stringNumber.charAt(0);
        int firstDigit = charNumber - '0';
        System.out.println(firstDigit);

        int value = 8943;
        value = Math.abs(value);

        while (value >= 10) {
            value /= 10;
        }

        System.out.println(value);
    }
}
