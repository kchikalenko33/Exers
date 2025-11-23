package training.classes.task4;

public class Department {
    private Employee[] employees;
    private int count;

    public Department(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Отдел переполнен.");
        }
    }

    public void showEmployees() {
        if (count == 0) {
            System.out.println("В отделе отсутствуют сотрудники");
            return;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void averageSalary() {
        if (count == 0) {
            System.out.println("В отделе нет сотрудников для расчёта зарплаты");
            return;
        }
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += employees[i].getSalary();
        }
        double avg = sum / count;
        System.out.println("Средняя зарплата по отделу : " + avg);
    }
}
