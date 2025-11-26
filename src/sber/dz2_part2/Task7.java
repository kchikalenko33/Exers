package sber.dz2_part2;

public class Task7 {
    public static void printDogsWin (String[] names, String[] namesDogs, double[][] grade) {
        int length = names.length - 1;
        double[] avgGrades = new double[length];

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= length; j++) {
                avgGrades[i] += grade[i][j];
            }
        }
    }

    public static void main(String[] args) {

    }
}
