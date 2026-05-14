package sber.dz4;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = List.of("dsgdsg", "aaaaaa","sdgdsg");
        String string = strings.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(string);
    }
}
