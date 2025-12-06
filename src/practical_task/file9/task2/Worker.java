package practical_task.file9.task2;

public class Worker extends Human {
    private double weekSalary;
    private int workDaysPerWeek;
    private int workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, int workDaysPerWeek, int workHoursPerDay) {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setWorkDaysPerWeek(workDaysPerWeek);
        setWorkHoursPerDay(workHoursPerDay);
    }

    public double calculatePerHourSalary() {
        return weekSalary / workDaysPerWeek / workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10) {
            throw new IllegalArgumentException("Need more than 10 coins");
        }
        this.weekSalary = weekSalary;
    }

    public int getWorkDaysPerWeek() {
        return workDaysPerWeek;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "weekSalary=" + weekSalary +
                ", workDaysPerWeek=" + workDaysPerWeek +
                ", workHoursPerDay=" + workHoursPerDay +
                '}';
    }

    public void setWorkDaysPerWeek(int workDaysPerWeek) {
        if (workDaysPerWeek < 1 || workDaysPerWeek > 7) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workdays per day");
        }
        this.workDaysPerWeek = workDaysPerWeek;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 24) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workdays per week");
        }
        this.workHoursPerDay = workHoursPerDay;
    }
}
