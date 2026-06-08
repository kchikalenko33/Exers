package code_mu.level9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        // Дан файл. Прочитайте его текст и найдите самое часто встречающееся слово в этом тексте.

        System.out.println(readFile(Path.of("C:\\projects\\Exers\\src\\asd.txt")));
    }

    public static String readFile(Path path) {

        try {
            List<String> strings = Files.readAllLines(path);
            Map<String, Long> words = strings.stream()
                    .flatMap(s -> Arrays.stream(s.split(" ")))
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
            return words.entrySet().stream()
                    .sorted((o1, o2) -> Long.compare(o2.getValue(), o1.getValue()))
                    .findFirst().get().getKey();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
