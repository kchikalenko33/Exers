package training.comparator.employee;

public class Employee {
    private int id;
    private String fullName;
    private String department;
    private double salary;
    private int experienceYear;

    public Employee(int id, String fullName, String department, double salary, int experienceYear) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.experienceYear = experienceYear;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    @Override
    public String toString() {
        return fullName + " ($" + salary + ")";
    }
}
