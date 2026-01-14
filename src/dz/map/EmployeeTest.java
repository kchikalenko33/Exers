package dz.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Иван Иванов", "IT", 100000);
        Employee emp4 = new Employee(1, "Иван Иванов", "IT", 100000);
        Employee emp5 = new Employee(1, "Иван Иванов", "IT", 100000);
        Employee emp2 = new Employee(1, "Иван Иванов", "Backend", 120000);  // Равен по equals (id+name)
        Employee emp3 = new Employee(2, "Петр Петров", "QA", 90000);        // Разный
        Employee emp6 = null;

        System.out.println(emp6.equals(emp2));

        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2));     // true
        System.out.println("emp1.hashCode() == emp2.hashCode(): " + (emp1.hashCode() == emp2.hashCode()));  // true
        System.out.println("emp1.equals(emp3): " + emp1.equals(emp3));     // false

        // HashSet: дубликаты не добавятся
        Set<Employee> set = new HashSet<>();
        set.add(emp1);
       // set.add(emp2);  // Не добавится!
        set.add(emp4);
        set.add(emp5);
        System.out.println("Set size: " + set.size());  // 1

        // HashMap: корректный поиск
        Map<Employee, String> map = new HashMap<>();
        map.put(emp1, "Senior Developer");
        System.out.println("map.get(emp2): " + map.get(emp2));  // "Senior Developer"
    }
}
