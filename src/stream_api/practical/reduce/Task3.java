package stream_api.practical.reduce;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", " ", "World", "!", " ", "Java");

        String phrase = words.stream()
                .reduce((s1, s2) -> s1 + s2)
                .orElse("");
        System.out.println(phrase);
    }
}
