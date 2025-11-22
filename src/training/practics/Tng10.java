package training.practics;

public class Tng10 {
    public static void main(String[] args) {
        int number = 1234;
        String s = String.valueOf(number);

        if (s.length() < 4) {
            System.out.println("Число должно иметь не менее 4х цифр");
            return;
        }

        int secondDigit = Character.getNumericValue(s.charAt(1));
        int penultimateDigit = Character.getNumericValue(s.charAt(s.length() - 2));
        System.out.println(secondDigit * penultimateDigit);
    }
}
