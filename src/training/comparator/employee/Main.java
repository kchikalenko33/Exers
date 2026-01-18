package training.comparator.employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Петров Максим Николаевич", "IT", 70000, 5));
        employees.add(new Employee(2, "Козлова Анна Михайловна", "HR", 50000, 3));
        employees.add(new Employee(3, "Иванов Игорь Петрович", "IT", 65000, 4));
        employees.add(new Employee(4, "Кузнецов Алексей Игоревич", "Finance", 80000, 8));
        employees.add(new Employee(5, "Волкова Ольга Кирилловна", "HR", 55000, 2));
        employees.add(new Employee(6, "Чернова Анна Михайловна", "HR", 50000, 3));
        employees.add(new Employee(7, null, "IT", 60000, 0));
        employees.add(new Employee(8, "Орлов Максим Михайлов", "Finance", 75000, 6));

        EmployeeSorter.sortAndPrint(employees, new SurnameComparator(), "фамилии");
        EmployeeSorter.sortAndPrint(employees, new SalaryComparator(), "зарплате");
        EmployeeSorter.sortAndPrint(employees, new ExperienceComparator(), "опыту работы");
        EmployeeSorter.sortAndPrint(employees, new DepartmentThenSurnameComparator(), "отделу и фамилии");
        EmployeeSorter.sortAndPrint(employees, new SalaryToExperienceRatioComparator(), "соотношению зарплаты к опыту");
    }
}
