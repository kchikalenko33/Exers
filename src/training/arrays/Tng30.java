package training.arrays;

public class Tng30 {
    public static void main(String[] args) {
        char[] arr = {'п', 'р', 'и', 'в', 'е', 'т', ',', ' ', 'л', 'е', 'с'};
        char[] sub = {'р', 'и', 'в', 'е', 'т', ',', ' ', 'л', 'е', 'с'};

        boolean found = false;

        other:
        for (int i = 0; i <= arr.length - sub.length; i++) {
            for (int j = 0; j < sub.length; j++) {
                if (arr[i + j] != sub[j]) {
                    continue other;
                }
            }
            found = true;
            break;
        }
        if (found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
