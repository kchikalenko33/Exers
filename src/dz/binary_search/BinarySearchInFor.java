package dz.binary_search;

public class BinarySearchInFor {
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        for (; left <= right; ) {
            int mid = left + (right - left) / 2;

            if (target == numbers[mid]) {
                return mid;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
