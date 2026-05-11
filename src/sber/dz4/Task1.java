package sber.dz4;

import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        int res = IntStream.iterate(2, i -> i <= 100, i -> i + 2)
                .sum();
        System.out.println(res);
    }
}
