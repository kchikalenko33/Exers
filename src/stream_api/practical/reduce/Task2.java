package stream_api.practical.reduce;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String word =  words.stream()
                .reduce((s1,s2) -> s1.length() > s2.length() ? s1 : s2)
                .orElse("");
        System.out.println(word + " " + word.length());
    }
}
