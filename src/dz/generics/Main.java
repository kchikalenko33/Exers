package dz.generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> num = List.of(1, 2 ,3 ,4, 6, 7.01, 8.2);
        printList(num);
    }

    public static void printList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number.doubleValue());
        }
    }
}
