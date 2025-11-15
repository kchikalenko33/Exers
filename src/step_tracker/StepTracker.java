package step_tracker;

public class StepTracker {
    private int goalStep = 10000;
    private MonthDate[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void addSteps (int day, int month, int steps) {

    }

    public void printStatistics(int monthNumber) {
        int sumSteps = 0;
        int maxSteps = 0;
        int averageSteps = 0;
        int[] month = monthToData[monthNumber - 1].getDays();
        // добавить переменные для лучшей серии

        for (int i = 0; i < 30; i++) {
            sumSteps += month[i];
        }
        //посчитать дистанцию и калории
    }

    public void setGoalStep(int goalStep) {
        this.goalStep = goalStep;
    }
}
