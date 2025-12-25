package myPackage.secondPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> num2 = new ArrayList<>(num);

        for (int number : num2) {
            if (number % 2 == 0) num.remove(Integer.valueOf(number));
        }

        System.out.println(num);

        Iterator<Integer> num3 = num2.iterator();
        while (num3.hasNext()) {
      //      if (num3.next().equals(3)) num3.remove();
            int a = num3.next();
            int b = num3.next();
            System.out.println();
        }
    }
}
