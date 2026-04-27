package skillfactory;

public class task3 {
    public static void main(String[] args) {
        System.out.println(reverseString("qwerty"));
        System.out.println(reverseString2("qwerty"));
        System.out.println(reverseString3("qwerty"));
    }

    public static String reverseString(String phrase) {
        if (phrase == null) {
            return null;
        }
        return new StringBuilder(phrase).reverse().toString();
    }

    public static String reverseString2(String phrase) {
        if (phrase == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder();

        for (int i = phrase.length() - 1; i >= 0; i--) {
            reversed.append(phrase.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverseString3(String phrase) {
        if (phrase == null) {
            return null;
        }
        char[] symbols = phrase.toCharArray();
        int left = 0;
        int right = symbols.length - 1;

        while (left < right) {
            char temp = symbols[left];
            symbols[left] = symbols[right];
            symbols[right] = temp;
            left++;
            right--;
        }

        return new String(symbols);
    }
}
