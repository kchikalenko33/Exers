package training.comparator.employee;

import java.util.Comparator;

public class SalaryToExperienceRatioComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        double ratio1 = calculateRatio(e1);
        double ratio2 = calculateRatio(e2);
        return Double.compare(ratio1, ratio2);
    }

    private double calculateRatio(Employee e) {
        if (e.getExperienceYear() == 0) return e.getSalary();
        return e.getSalary() / e.getExperienceYear();
    }
}
