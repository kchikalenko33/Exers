package dz.map;

import java.util.Objects;

public class Employee {
    private final int id;
    private final String name;
    private final String department;
    private int salary;

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Рефлексивность: одна ссылка
        if (obj == null || this.getClass() != obj.getClass()) return false;  // null и тип
        Employee employee = (Employee) obj;
        // Сравниваем только бизнес-ключи: id и name
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
