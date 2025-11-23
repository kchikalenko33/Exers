package training.classes.task4;

public class Main {
    public static void main(String[] args) {
        Department dep = new Department(5);

        dep.addEmployee(new Employee("Иван", "Инженер", 70000));
        dep.addEmployee(new Employee("Мария", "Аналитик", 80000));
        dep.addEmployee(new Employee("Петр", "Тестировщик", 60000));

        dep.showEmployees();
        dep.averageSalary();
    }
}
