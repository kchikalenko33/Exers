package stream_api;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {
        // Проверка на возраст
        Predicate<Integer> isAdult = (age) -> age > 17;
        boolean res = isAdult.test(30);
        System.out.println(res);

        // Покупка в автомате напитка
        Function<Integer, String> automate = (money) -> {
          if (money ==  100) {
              return "cola";
          } else if (money == 50) {
              return "water";
          } else {
              return "nothing";
          }
        };
        System.out.println(automate.apply(100));

        // Костер
        Consumer<String> fire = (item) -> {
            if (item.equals("дрова")) {
                System.out.println("горит долго");
            } else if (item.equals("бумага")) {
                System.out.println("горит ярко");
            }
        };

        fire.accept("дрова");

        // Талоны в очереди
        Supplier<Integer> talons = () -> new Random().nextInt(100);
        System.out.println(talons.get());
    }
}
