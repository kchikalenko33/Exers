package skillfactory;

import java.util.HashSet;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        String phrase = "skkkkill";
        Set<Character> symbols = new HashSet<>();
        for (char ch : phrase.toCharArray()) {
            symbols.add(ch);
        }
        System.out.println(phrase.length() - symbols.size());
    }
}
