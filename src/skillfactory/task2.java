package skillfactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class task2 {
    public static char noRepeat(String phrase) {
        char[] symbols = phrase.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            boolean isRepeat = false;
            char ch = symbols[i];
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[i] == symbols[j] && i != j) {
                    isRepeat = true;
                }
            }
            if (!isRepeat) {
                return ch;
            }

        }
        return '\u0000';
    }

    public static void main(String[] args) {
        // System.out.println(noRepeat("sffaadd"));
        System.out.println(notRepeat("ffahgahddfgl"));
    }

    public static char notRepeat(String phrase) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (char ch : phrase.toCharArray()) {
            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> ch : chars.entrySet()) {
            if (ch.getValue() == 1) {
                return ch.getKey();
            }
        }

        return '\u0000';
    }
}
