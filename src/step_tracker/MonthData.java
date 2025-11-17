package step_tracker;

public class MonthData {
    private int[] days = new int[30];

    public void addStepOfDay(int day, int countStep) {
        days[day - 1] = countStep;
    }

    public int[] getDays() {
        return days;
    }

}
