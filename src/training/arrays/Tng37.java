package training.arrays;

public class Tng37 {
    public static int countDistinct(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isPicked = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    isPicked = true;
                    break;
                }

            }
            if (!isPicked) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,2};
        System.out.println(countDistinct(arr));
    }
}
