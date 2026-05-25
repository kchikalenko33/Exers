package stream_api.practical;

import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> words = List.of("1", "2", "3", "4", "5");

        words.stream()
                .filter(w -> {
                    System.out.println("Фильтрую " + w);
                    return true;})
                .peek(w -> {
                    System.out.println("Выполняю метод peek с элементом " + w);})
                .map(w -> {
                    System.out.println("Выполняю метод map " + w);
                    return w;})
                .sorted((x,y) -> y.compareTo(x))
                .peek(w -> {
                    System.out.println("Выполняю метод peek с элементом " + w);})
                .forEach((w) -> System.out.println("Выполняю метод forEach " + w));

    }
}
