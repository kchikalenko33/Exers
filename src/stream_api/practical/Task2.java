package stream_api.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
//        Используя Stream API, нужно сгруппировать транзакции по категориям и для каждой категории вычислить:
//        Общую сумму трат в этой категории.
//        Количество транзакций в категории.
//        Отсортировать категории по общей сумме в порядке убывания.
//
//        Entertainment: 2 транзакции, общая сумма = $125.0
//        Food: 3 транзакции, общая сумма = $88.0
//        Transport: 2 транзакции, общая сумма = $35.0


        List<Transaction> transactions = Arrays.asList(
                new Transaction("Food", 45.50),
                new Transaction("Transport", 20.00),
                new Transaction("Food", 30.00),
                new Transaction("Entertainment", 50.00),
                new Transaction("Transport", 15.00),
                new Transaction("Food", 12.50),
                new Transaction("Entertainment", 75.00)
        );

        List<CategoryStatus> res = transactions.stream()
                .collect(Collectors.groupingBy(t -> t.getCategory(),
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    int count = list.size();
                                    double total = list.stream()
                                            .mapToDouble(t -> t.getAmount())
                                            .sum();
                                    return new CategoryStatus(list.get(0).getCategory(), count, total);
                                }
                        )
                ))
                .values()
                .stream()
                .sorted((a,b) -> Double.compare(b.totalAmount, a.totalAmount))
                .toList();

                res.forEach(s-> System.out.println(s));


    }
}
