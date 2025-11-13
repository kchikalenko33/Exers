package dz.binary_search;

public class BinarySearchInFori {
    public static int binarySearch(int[] numbers, int target, int attempt) {
        int left = 0;
        int right = numbers.length - 1;

        for (int i = 0; i <= attempt; i++) {
            int mid = left + (right - left) / 2;

            if(target == numbers[mid]) {
                return mid;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (left >right) {
                break;
            }
        }

        return -1;
    }
}
