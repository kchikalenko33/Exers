package step_tracker;

public class StepTracker {
    private int goalStep = 10000;
    private MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void addSteps(int day, int month, int steps) {
        if (steps < 0) {
            System.out.println("Ошибка: количество шагов не может быть отрицательным.");
            return;
        }
        if (month < 0 || month >= 12) {
            System.out.println("Ошибка: неверный номер месяца.");
            return;
        }
        if (day < 1 || day > 30) {
            System.out.println("Ошибка: неверный номер дня.");
            return;
        }
        monthToData[month].addStepOfDay(day, steps);
        System.out.println("Шаги успешно сохранены.");
    }

    public void printStatistics(int monthNumber) {
        int sumSteps = 0;
        int maxSteps = 0;
        int averageSteps = 0;
        double distance;
        double calories;
        int bestSeries = 0;
        int currentSeries = 0;

        int[] month = monthToData[monthNumber].getDays();


        for (int i = 0; i < 30; i++) {
            System.out.print((i + 1) + " день: " + month[i]);
            if (i < 29) {
                System.out.print(", ");
            }

            if ((i + 1) % 5 == 0) {
                System.out.println();
            }

                sumSteps += month[i];
            if (month[i] > maxSteps) {
                maxSteps = month[i];
            }

            if (month[i] >= goalStep) {
                currentSeries++;
                if (currentSeries > bestSeries) {
                    bestSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }

        System.out.println();

        averageSteps = sumSteps / 30;
        distance = sumSteps * 0.00075; // средняя длина шага 0.75 м = 0.00075 км
        calories = sumSteps * 0.05; // примерный коэффициент калорий на шаг

        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное количество шагов в месяце: " + maxSteps);
        System.out.println("Среднее количество шагов в день: " + averageSteps);
        System.out.println("Пройденная дистанция (км): " + distance);
        System.out.println("Количество сожжённых килокалорий:" + calories);
        System.out.println("Лучшая серия дней с достижением цели: " + bestSeries);
    }

    public void setGoalStep(int goalStep) {
        if (goalStep < 0) {
            System.out.println("Ошибка: цель не может быть отрицательной.");
            return;
        }
        this.goalStep = goalStep;
        System.out.println("Цель успешно изменена на " + goalStep + " шагов.");
    }
}
