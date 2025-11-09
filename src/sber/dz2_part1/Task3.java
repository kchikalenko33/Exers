package sber.dz2_part1;

public class Task3 {
    public static int addNumberOfArray(int[] a, int x) {
        int index = -1;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] == x) {
                index = i + 1;
            } else if (a[i] > x) {
                if (index == -1) {
                    return i;
                } else {
                    return index;
                }
            }
        }
        return index == -1 ? a.length : index;
    } //todo
}
