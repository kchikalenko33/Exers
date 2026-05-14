package sber.dz4;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Double> nums = List.of(32.00, 2.04, 109.92);
        List<Double> sortNums = nums.stream()
                .sorted((x,y) ->x.compareTo(y))
                .toList();
        System.out.println(sortNums);
    }
}
