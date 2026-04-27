package skillfactory;

public class Task7 {
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.toLowerCase().replaceAll("\\s", "");
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        return cleanedInput.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("qazaq"));
    }
}
