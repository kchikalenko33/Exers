package training.repeat.dz2_1;

public class Ex3_1 {
    public static int index(int[] num, int x) {
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (x < num[i]) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(index(num, 2));
    }
}
