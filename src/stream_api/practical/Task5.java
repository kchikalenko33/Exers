package stream_api.practical;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date", "apple");
        List<String> res = words.stream()
                .distinct()
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println(res);
    }
}
