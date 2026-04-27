package training.anonimInterface;

import java.util.function.*;

public class MyClass {
    public static void main(String[] args) {
        MyFunction<String> test = new MyFunction<String>() {
            @Override
            public String myMethode(String string) {
                return string.toUpperCase();
            }
        };

        MyFunction<String> newTest = s -> {
            System.out.println("Верхний регистр");
            return s.toUpperCase();
        };

        Function<String, Integer> test2 = s -> Integer.parseInt(s);
        Function<String, Integer> newTest2 = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return Integer.parseInt(string);
            }
        };

        System.out.println(test2.apply("15"));

        Predicate<Integer> test3 = b -> b != null && b % 2 == 0;
        Predicate<Integer> newTest3 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer != null && integer % 2 == 0;
            }
        };

        System.out.println(test3.test(null));
        System.out.println(newTest3.test(2));

        Consumer<Integer> test4 = i -> System.out.println(i * i);
        Consumer<Integer> newTest4 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer * integer);
            }
        };

        Supplier<String> test5 = () -> "Hello world";
        Supplier<String> newTest5 = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        };

        UnaryOperator<Integer> test6 = i -> i * i;
        UnaryOperator<Integer> newTest6 = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };
    }

    public static int Number(int num) {
        if (num == 1) {
            throw new IllegalArgumentException("Ошибка, 1 не может быть");
        } else {
            return num * num;
        }
    }
}
