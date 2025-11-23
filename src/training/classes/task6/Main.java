package training.classes.task6;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(5);

        Employee emp1 = new Employee("Иван", "Иванов", 50000);
        Manager mgr1 = new Manager("Петр", "Петров", 70000, 1.2);
        Developer dev1 = new Developer("Мария", "Сидорова", 60000, "Java");
        Intern intern1 = new Intern("Алексей", "Кузнецов", 30000, 6);

        company.addEmployee(emp1);
        company.addEmployee(mgr1);
        company.addEmployee(dev1);
        company.addEmployee(intern1);

        System.out.println("Список сотрудников:");
        company.showEmployee();

        System.out.println();
        company.setYearSalaryCompany();
    }
}
