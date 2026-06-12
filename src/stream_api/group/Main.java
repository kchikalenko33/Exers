package stream_api.group;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("Electronics", 1500.0, LocalDate.of(2024, 1, 15), true),
                new Transaction("Books", 45.0, LocalDate.of(2024, 1, 18), true),
                new Transaction("Electronics", 800.0, LocalDate.of(2024, 1, 20), false),
                new Transaction("Clothing", 120.0, LocalDate.of(2024, 2, 5), true),
                new Transaction("Books", 30.0, LocalDate.of(2024, 2, 10), true),
                new Transaction("Electronics", 2000.0, LocalDate.of(2024, 2, 15), true),
                new Transaction("Clothing", 200.0, LocalDate.of(2024, 2, 20), false),
                new Transaction("Books", 60.0, LocalDate.of(2024, 3, 1), true),
                new Transaction("Electronics", 500.0, LocalDate.of(2024, 3, 5), false),
                new Transaction("Clothing", 80.0, LocalDate.of(2024, 3, 10), true),
                new Transaction("Books", 25.0, LocalDate.of(2024, 3, 12), false),
                new Transaction("Electronics", 1200.0, LocalDate.of(2024, 3, 15), true)
        );

        List<String> strings = List.of("a1", "b12", "c123", "d", "e");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        Map<Integer, List<String>> stringsByLength = strings.stream()
                .collect(groupingBy(s -> s.length()));
        stringsByLength.forEach((a,b) -> System.out.println(a + " " + b));

        Map<String, List<Integer>> integersByEven = integers.stream()
                .collect(groupingBy(i -> i % 2 == 0 ? "четный" : "нечетный"));
        integersByEven.forEach((a,b) -> System.out.println(a + " " + b));


        Map<String, List<Transaction>> transactionsByCategory = transactions.stream()
                .collect(groupingBy(transaction -> transaction.category()));
        System.out.println(transactionsByCategory);

        Map<Integer, List<Transaction>> transactionsByMonth = transactions.stream()
                .collect(groupingBy(transaction -> transaction.date().getMonth().getValue()));
        System.out.println(transactionsByMonth);

        Map<Boolean, List<Transaction>> transactionsBySuccessful = transactions.stream()
                .collect(groupingBy(transaction -> transaction.isSuccessful()));
        System.out.println(transactionsBySuccessful);

        Map<String, Long> transactionsByCount = transactions.stream()
                .collect(groupingBy(transaction -> transaction.category(), counting()));
        System.out.println(transactionsByCount);

        Map<String, Double> transactionsBySum = transactions.stream()
                .collect(groupingBy(t -> t.category(), summingDouble(t -> t.amount())));
        transactionsBySum.forEach((a,b) -> System.out.println(a + " " + b));

        Map<String, Double> transactionsByMax = transactions.stream()
                .collect(toMap(
                        t -> t.category(),
                        t -> t.amount(),
                        (t1, t2) -> Double.max(t1, t2)
                ));
        transactionsByMax.forEach((k, v) -> System.out.println(k + " " + v));

        Map<Integer, Double> transactionsAvgByMonth = transactions.stream()
                .collect(groupingBy(t -> t.date().getMonth().getValue(),
                        averagingDouble(t -> t.amount())));
        transactionsAvgByMonth.forEach((k,v) -> System.out.println(k + " " + v));

        Map<String, Map<Boolean, List<Transaction>>> transactionsByCategoryAndSuccess = transactions.stream()
                .collect(groupingBy(t -> t.category(), groupingBy(t -> t.isSuccessful())));
        transactionsByCategoryAndSuccess.forEach((k,v) -> System.out.println(k + " " + v));

        Map<Integer, Map<String, List<Transaction>>> transactionsByMonthAndCategory = transactions.stream()
                .collect(groupingBy(t -> t.date().getMonth().getValue(), groupingBy(t -> t.category())));
        transactionsByMonthAndCategory.forEach((k,v) -> System.out.println(k + " " + v));

        Map<String, List<Double>> transactionsByCategoryAndSum;
    }
}
