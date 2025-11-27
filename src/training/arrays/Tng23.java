package training.arrays;

public class Tng23 {
    public static void main(String[] args) {
        int[] grades = {5,4,3,2,9,6,7,7,8,5};

        int max1 = -1;
        int max2 = -1;
        int max3 = -1;

        for (int g : grades) {
            if (g > max1) {
                max3 = max2;
                max2 = max1;
                max1 = g;
            } else if (g > max2) {
                max3 = max2;
                max2 = g;
            } else if (g > max3) {
                max3 = g;
            }
        }

        System.out.println("max value - " + max1 + " " + max2 + " " + max3);
    }
}
