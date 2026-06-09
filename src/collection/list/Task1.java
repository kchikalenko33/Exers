package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Hello");
        words.add("Kirill");
        words.add("Gol");

        for (String word : words) System.out.println(word);
        System.out.println(" __________________ ");
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
        System.out.println("---------");
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).toLowerCase().contains("a")) {
                words.set(i, words.get(i).toUpperCase());
            }
        }
        System.out.println(words);
        System.out.println("----------");
        System.out.println("Удаление слов короче 5 символов:");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() < 5) iterator.remove();
        }
        System.out.println(words);
    }
}
