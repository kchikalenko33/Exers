package sber.dz4;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = List.of("sdgsdg", "", "", "", "sdg");
        int count = (int) strings.stream()
                .filter(x -> !x.isEmpty())
                .count();
        System.out.println(count);
    }
}
