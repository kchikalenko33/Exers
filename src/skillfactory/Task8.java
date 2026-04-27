package skillfactory;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    /*Необходимо реализовать метод, задача которого заключается в удалении всех дубликатов букв из переданной строки
    Пример ввод - тест
    Пример вывода - тес*/

    public static void main(String[] args) {
        System.out.println(deleteDublecate("psdgddssda"));
    }

    public static String deleteDublecate(String phrase) {
        if (phrase == null) {
            return null;
        }
        StringBuilder res = new StringBuilder();
        Set<Character> symbols = new HashSet<>();

        for (char ch : phrase.toCharArray()) {
            if (symbols.add(ch)) {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
