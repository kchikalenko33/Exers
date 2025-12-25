package training.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class tng2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(20) + 1);
        }
        System.out.println(numbers);
        System.out.println("Индекс 15: " + numbers.indexOf(15));
        Collections.sort(numbers);
        System.out.println(numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if(numbers.get(i) < 10) numbers.remove(i);
        }

        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
