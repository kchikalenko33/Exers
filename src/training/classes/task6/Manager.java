package training.classes.task6;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String surname, double salary, double bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public Manager(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double yearSalary() {
        return salary * 12 * bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
