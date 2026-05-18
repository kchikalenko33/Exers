package stream_api.practical.match;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Python", "JavaScript", "Ruby", "Go");

        boolean allUp = words.stream()
                .allMatch(w -> Character.isUpperCase(w.charAt(0)));

        boolean allLongerThen2 = words.stream()
                .allMatch(w -> w.length() > 2);

        boolean hasLetterA = words.stream()
                .anyMatch(w -> w.length() > 2); // todo
    }
}
