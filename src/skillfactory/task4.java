package skillfactory;

public class task4 {
    public static void main(String[] args) {
        System.out.println(containsOnlyLetters2("abc"));
        System.out.println(containsOnlyLetters("123a"));
    }

    public static boolean containsOnlyLetters(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return false;
        }
        return phrase.matches("[a-zA-Zа-яА-ЯёЁ]+");
    }

    public static boolean containsOnlyLetters2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return false;
        }

        try {
            for (char c : phrase.toCharArray()) {
                if (!Character.isLetter(c)) {
                    throw new IllegalArgumentException("Строка содержит не-буквенные символы");
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
