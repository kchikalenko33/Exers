package stream_api.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<Integer> counts = words.stream()
                .map(s -> s.length())
                .sorted((x, y) -> y.compareTo(x))
                .toList();

        System.out.println(counts);

        List<Integer> numbers = List.of(5, 12, 3, 18, 7, 22, 9, 14);
        String phrase = "Hello world";

        words.stream()
                .flatMapToInt(x -> x.chars())
                .distinct()
                .forEach((s) -> System.out.println((char) s));


        List<Integer> res = numbers.stream()
                .sorted((x, y) -> y.compareTo(x))
                .limit(2)
                .toList();

        System.out.println(res);

        List<String> words2 = Arrays.asList("apple dfg", "banana df", "cherry sd ", "date sddg", "elderberry sdg");

        List<String> res2 = words2.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();

        System.out.println(res2);

        String phrase2 = res2.stream()
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()))
                .collect(Collectors.joining());

        System.out.println(phrase2);


        List<String> word3 = new ArrayList<>();
        System.out.println(word3.stream()
                .reduce((s1, s2) -> s1 + s2)
                .orElse("_"));

    }
}
