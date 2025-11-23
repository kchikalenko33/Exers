package training.classes.task6;

public class Company {
    private Employee[] employees;
    private int count;
    private double yearSalaryCompany;

    public Company(int capacity) {
            employees = new Employee[capacity];
            count = 0;
            yearSalaryCompany = 0;
    }

    public void addEmployee(Employee employee) {
        if (count >= employees.length) {
            System.out.println("Список сотрудников в компании переполнен.");
            return;
        } else {
            employees[count] = employee;
            count++;
        }
    }

    public void showEmployee() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public void setYearSalaryCompany() {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.yearSalary();
            }
        }
        System.out.println("Общая сумма годовых доходов сотрудников = " + sum);
    }
}
