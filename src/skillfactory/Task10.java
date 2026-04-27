package skillfactory;

public class Task10 {
    /*В данном задании необходимо написать метод, который вернет входную строчку, повторенную n раз
    Пример ввода - тест, 2
    Пример вывода - тесттест*/
    public static void main(String[] args) {
        System.out.println(repeat("asdf", 2));
        System.out.println(repeat2("asdf", 2));
    }

    public static String repeat(String phrase, int n) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            res.append(phrase);
        }

        return res.toString();
    }

    public static String repeat2(String phrase, int n) {
        return phrase.repeat(n);
    }
}
