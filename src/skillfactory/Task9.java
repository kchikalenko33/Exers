package skillfactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task9 {
    /*В данном задании необходимо отсортировать строчки по их длине
    Необходимо поддержать сортировку как по возрастанию, так и по убыванию*/
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "fig"};

        System.out.println("До сортировки: " + Arrays.toString(strings));

        sortStringsByLength(strings, SortingBy.ASC);
        System.out.println("После сортировки по возрастанию: " + Arrays.toString(strings));

        sortStringsByLength(strings, SortingBy.DESC);
        System.out.println("После сортировки по убыванию: " + Arrays.toString(strings));
    }

    public static void sortStringsByLength(String[] strings, SortingBy sortBy) {
        if (sortBy == SortingBy.ASC) {
            Arrays.sort(strings, new ComparatorStrByLength());
        } else if (sortBy == SortingBy.DESC) {
            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            } ;
            Arrays.sort(strings, comparator);
        }
    }
}
