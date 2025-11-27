package training.arrays;

public class Tng24 {
    public static void main(String[] args) {
        int[] grades = {5, 4, 3, 2, 9, 6, 7, 7, 8, 5};
        int max1 = -1;
        int max2 = -1;
        int max3 = -1;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = grades[i];
            } else if (grades[i] > max2) {
                max3 = max2;
                max2 = grades[i];
            } else if (grades[i] > max3) {
                max3 = grades[i];
            }
        }

        System.out.println("max value - " + max1 + " " + max2 + " " + max3);
    }

}
