package training.arrays;

public class Tng38 {
    public static int countNonRepeating(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int countRepeat = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) countRepeat++;
            }

            if (countRepeat == 1) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,3,1,3,2};

        System.out.println(countNonRepeating(arr));
    }
}
