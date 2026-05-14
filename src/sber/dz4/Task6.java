package sber.dz4;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        Set<Integer> num = Set.of(1, 2, 3, 4);
        Set<Integer> num2 = Set.of(5, 6, 43, 54);
        Set<Integer> num3 = Set.of(41, 32, 23, 14);
        Set<Set<Integer>> sets = Set.of(num, num2, num3);

        Set<Integer> newNum = sets.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toSet());

        Set<Integer> newNum2 = sets.stream()
                .flatMap(x -> x.stream())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));

        System.out.println(newNum2);
    }
}
