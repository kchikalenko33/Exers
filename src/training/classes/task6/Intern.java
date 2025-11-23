package training.classes.task6;

public class Intern extends Employee{
    private int countMonthInternship;

    public Intern(String name, String surname, double salary, int countMonthInternship) {
        super(name, surname, salary);
        this.countMonthInternship = countMonthInternship;
    }

    public Intern(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double yearSalary() {
        return salary * countMonthInternship;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "countMonthInternship=" + countMonthInternship +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getCountMonthInternship() {
        return countMonthInternship;
    }

    public void setCountMonthInternship(int countMonthInternship) {
        this.countMonthInternship = countMonthInternship;
    }
}
