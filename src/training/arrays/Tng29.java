package training.arrays;

import java.util.Random;

public class Tng29 {
    public static void main(String[] args) {
        Random random = new Random();
        int countMember = random.nextInt(5, 15);
        String[] allNames = {
                "Иван", "Мария", "Анна", "Павел", "Елена",
                "Дмитрий", "Ольга", "Сергей", "Татьяна", "Александр",
                "Наталья", "Владимир", "Светлана", "Юрий", "Анастасия"
        };
        int sizeAllNames = allNames.length;
        ;
        String[] names = new String[countMember];

        for (int i = 0; i < countMember; i++) {
            int indexAllNames = random.nextInt(sizeAllNames);
            names[i] = allNames[indexAllNames];
            allNames[indexAllNames] = allNames[sizeAllNames - 1];
            sizeAllNames--;
        }

        String[] allDogsNames = {
                "Бим", "Мухтар", "Рекс", "Лорд", "Душа",
                "Джессика", "Барон", "Дружок", "Ася", "Шарик",
                "Боня", "Джина", "Граф", "Персик", "Пушок"
        };
        int sizeAllDogsNames = allDogsNames.length;
        String[] dogsNames = new String[countMember];

        for (int i = 0; i < countMember; i++) {
            int indexAllDogsNames = random.nextInt(sizeAllDogsNames);
            dogsNames[i] = allDogsNames[indexAllDogsNames];
            allDogsNames[indexAllDogsNames] = allDogsNames[sizeAllDogsNames - 1];
            sizeAllDogsNames--;
        }

        double[][] judgesScores = new double[countMember][3];
        double[] avgGrades = new double[countMember];

        for (int i = 0; i < countMember; i++) {
            judgesScores[i][0] = random.nextDouble(10);
            judgesScores[i][1] = random.nextDouble(10);
            judgesScores[i][2] = random.nextDouble(10);
            avgGrades[i] = (judgesScores[i][0] + judgesScores[i][1] + judgesScores[i][2]) / 3;
        }

        resultsCompetition(names, dogsNames, avgGrades, countMember);
    }

    public static void resultsCompetition(String[] names, String[] dogsNames, double[] avgGrades, int countMember) {
        int[] topIndexes = {-1, -1, -1,};

        for (int i = 0; i < 3; i++) {
            double maxGrade = -1;
            int maxIndex = -1;

            other:
            for (int j = 0; j < avgGrades.length; j++) {
                for (int k = 0; k < i; k++) {
                    if (topIndexes[k] == j) {
                        continue other;
                    }

                }
                if (avgGrades[j] > maxGrade) {
                    maxGrade = avgGrades[j];
                    maxIndex = j;
                }
            }

            topIndexes[i] = maxIndex;
        }

        for (int i = 0; i < 3; i++) {
            int j = topIndexes[i];
            System.out.printf("%s: %s, %.1f\n", names[j], dogsNames[j], avgGrades[j]);
        }
    }

}
