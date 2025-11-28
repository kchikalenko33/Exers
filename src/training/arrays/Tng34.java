package training.arrays;

public class Tng34 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) count++;
            }
        }

        System.out.println(count);
    }
}
