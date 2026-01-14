package dz.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ListIterator<String> lit = list.listIterator();

// Движение вперёд
        while (lit.hasNext()) {
            String element = lit.next();
            if (element.equals("b")) {
                lit.set("B"); // Замена элемента
                lit.add("X"); // Вставка после "B"
            }
        }

// Движение назад
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
