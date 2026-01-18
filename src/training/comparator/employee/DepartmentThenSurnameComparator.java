package training.comparator.employee;

import java.util.Comparator;

public class DepartmentThenSurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int compareDept = compareDepartment(e1.getDepartment(), e2.getDepartment());

        if (compareDept != 0) return compareDept;

        SurnameComparator surnameComp = new SurnameComparator();
        return surnameComp.compare(e1,e2);
    }

    private int compareDepartment(String s1, String s2) {
        if (s1 == null && s2 == null) return 0;
        if (s1 == null) return -1;
        if (s2 == null) return 1;

        return s1.compareTo(s2);
    }
}
