package training.arrays;

public class Tng36 {
    public static boolean isSortedAscending(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return true;

        boolean isTrue = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i -1]) isTrue = true;
            else return false;
        }

        return isTrue;
    }

    public static void main(String[] args) {
        int[] arr = { 8,5,6,7};

        System.out.println(isSortedAscending(arr));
    }
}
