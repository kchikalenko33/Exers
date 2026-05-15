package stream_api.practical;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        List<String> res = words.stream()
                .filter(s -> s.length() > 4)
                .map(s -> s.toUpperCase())
                .sorted()
                .toList();
        System.out.println(res);
    }
}
