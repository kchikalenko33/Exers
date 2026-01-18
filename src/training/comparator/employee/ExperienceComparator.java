package training.comparator.employee;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getExperienceYear(), e2.getExperienceYear());
    }
}
