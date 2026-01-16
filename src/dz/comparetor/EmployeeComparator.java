package dz.comparetor;

import dz.map.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getId() - o2.getId();
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                result = o1.getDepartment().compareTo(o2.getName());
            }
        }
        return result;
    }
//    @Override
//    public int compare(Employee e) {
//        return
//    }

    public static void main(String[] args) {
        System.out.println("А".compareTo("я"));
    }
}
