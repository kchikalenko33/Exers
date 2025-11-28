package training.arrays;

public class Tng33 {
    public static boolean isSortedAscending(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        boolean isTrue = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                isTrue = true;
            } else {
                return false;
            }
        }

        return isTrue;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,7,8};
        System.out.println(isSortedAscending(arr));
    }
}
