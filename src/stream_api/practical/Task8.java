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

//        Фильтрую 1
//        Выполняю метод peek с элементом 1
//        Выполняю метод map 1
//        Фильтрую 2
//        Выполняю метод peek с элементом 2
//        Выполняю метод map 2
//        Фильтрую 3
//        Выполняю метод peek с элементом 3
//        Выполняю метод map 3
//        Фильтрую 4
//        Выполняю метод peek с элементом 4
//        Выполняю метод map 4
//        Фильтрую 5
//        Выполняю метод peek с элементом 5
//        Выполняю метод map 5
//        Выполняю метод peek с элементом 5
//        Выполняю метод forEach 5
//        Выполняю метод peek с элементом 4
//        Выполняю метод forEach 4
//        Выполняю метод forEach 3
//        Выполняю метод forEach 2
//        Выполняю метод forEach 1


    }
}
