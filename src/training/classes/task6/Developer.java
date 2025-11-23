package training.classes.task6;

public class Developer extends Employee{
    private String specialization;

    public Developer(String name, String surname, double salary, String specialization) {
        super(name, surname, salary);
        this.specialization = specialization;
    }

    public Developer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "specialization='" + specialization + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
