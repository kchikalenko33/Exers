package sber.dz2_part2;

import java.util.Random;

public class Task7 {
    public static void printDogsWin(String[] names, String[] namesDogs, double[] avgGrade, int length) {
        int[] topIndex = {-1, -1, -1};

        for (int i = 0; i < 3; i++) {
            double maxGrade = -1;
            int maxIndex = -1;

            for (int j = 0; j < length; j++) {
                boolean alreadyPicked = false;

                for (int k = 0; k < i; k++) {
                    if (topIndex[k] == j) {
                        alreadyPicked = true;
                    }
                }

                if (!alreadyPicked && avgGrade[j] > maxGrade) {
                    maxGrade = avgGrade[j];
                    maxIndex = j;
                }
            }

            topIndex[i] = maxIndex;
        }

        for (int i = 0; i < 3; i++) {
            int j = topIndex[i];
            System.out.printf("%s: %s, %.1f\n", names[j], namesDogs[j], avgGrade[j]);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(5, 15);
        String[] namesRandom = {
                "Иван", "Мария", "Анна", "Павел", "Елена",
                "Дмитрий", "Ольга", "Сергей", "Татьяна", "Александр",
                "Наталья", "Владимир", "Светлана", "Юрий", "Анастасия"
        };
        String[] namesDogRandom = {
                "Бим", "Мухтар", "Рекс", "Лорд", "Душа",
                "Джессика", "Барон", "Дружок", "Ася", "Шарик",
                "Боня", "Джина", "Граф", "Персик", "Пушок"
        };
        String[] namesDogs = new String[length];
        int sizeNamesDogRandom = namesDogRandom.length;

        for (int i = 0; i < length; i++) {
            int indexDog = random.nextInt(sizeNamesDogRandom);
            namesDogs[i] = namesDogRandom[indexDog];
            namesDogRandom[indexDog] = namesDogRandom[sizeNamesDogRandom - 1];
            sizeNamesDogRandom--;
        }


        String[] names = new String[length];
        int sizeNamesRandom = namesRandom.length;

        for (int i = 0; i < length; i++) {
            int idx = random.nextInt(sizeNamesRandom);
            names[i] = namesRandom[idx];
            namesRandom[idx] = namesRandom[sizeNamesRandom - 1];
            sizeNamesRandom--;
        }

        double[][] grade = new double[length][3];
        double[] avgGrades = new double[length];

        for (int i = 0; i < length; i++) {
            grade[i][0] = random.nextDouble(10);
            grade[i][1] = random.nextDouble(10);
            grade[i][2] = random.nextDouble(10);
            avgGrades[i] = ((grade[i][0] + grade[i][1] + grade[i][2]) / 3);
        }

        printDogsWin(names, namesDogs, avgGrades, length);

    }
}
