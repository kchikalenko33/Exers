package training.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class tng1 {
    public static void main(String[] args) {
        List<String> listFruits = new ArrayList<>(List.of("яблоко", "банан", "апельсин", "киви", "манго"));
        listFruits.add("мандарин");
        listFruits.add("виноград");
        listFruits.remove(0);
        System.out.println("Есть банан? " + listFruits.contains("банан"));
        System.out.println("Размер " + listFruits.size());
        for (String fruit : listFruits) {
            System.out.println(fruit);
        }
    }
}
