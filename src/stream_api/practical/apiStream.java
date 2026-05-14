package stream_api.practical;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class apiStream {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //возведение в квадрат
        int[] squaredNums = Arrays.stream(nums)
                .map(number -> number * number)
                .toArray();

        System.out.println(Arrays.toString(squaredNums));

        // новый лист с четными числами
        List<Integer> values = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNums = values.stream()
                .filter(n -> n % 2 == 0)
                .toList(); // неизменяемый, производительный
        System.out.println(evenNums);

        // альтернативный способ через collect
        List<Integer> newValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newEvenNums = newValues.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList()); // изменяемый, менее производительный
        System.out.println(newEvenNums);

        // Преобразование строк в верхний регистр
        // Условие: дан список строк. Преобразуйте все строки в верхний регистр с помощью Stream API и соберите результат в новый список.
        List<String> strings = List.of("asd", "sfds", "sdg", "wqrq");
        List<String> newStrings = strings.stream()
                .map(s -> s.toUpperCase()) // String::toUpperCase
                .collect(Collectors.toList());
        System.out.println(newStrings);

        // Сумма квадратов чисел
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(sum);



        //Поиск макс числа
        int[] nums2 = {4, 2, 5, 66, 457, 3, -10, 32, 3};
        Optional<Integer> maxNum = Arrays.stream(nums2)
                .boxed()
                .max((x, y) -> x.compareTo(y));
        System.out.println(maxNum);

        //Подсчёт количества строк определённой длины == 5
       String[] strings2 = {"asdвап", "sfdsфвп", "sdg", "wqrq", "sdgsdg"};

       //
        IntStream.range(1,101)
                .filter(n -> n % 2 == 0)
                .forEach(x -> System.out.println(x));

        Stream.iterate(2, i -> i < 101, i -> i + 2)
                .forEach(x -> System.out.println(x));

    }
}
