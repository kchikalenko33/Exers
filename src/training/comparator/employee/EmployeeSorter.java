package training.comparator.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorter {
    public static void sortAndPrint(List<Employee> employees, Comparator<Employee> comparator, String criterion) {
        List<Employee> sortEmp = new ArrayList<>(employees);
        Collections.sort(sortEmp, comparator);

        System.out.println("Сотрудники отсортированы по: " + criterion + ":");
        for (Employee emp : sortEmp) {
            System.out.println(emp);
        }

        System.out.println();
    }
}
