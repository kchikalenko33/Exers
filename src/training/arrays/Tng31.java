package training.arrays;

public class Tng31 {
    public static boolean contains(char[] sub, char[] arr) {
        if (sub.length == 0 || sub.length > arr.length) {
            return false;
        }

        outer:
        for (int i = 0; i <= arr.length - sub.length; i++) {
            for (int j = 0; j < sub.length; j++) {
                if (arr[i + j] != sub[j]) {
                    continue outer;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[] arr = {'п','р','и','в','е','т',',',' ','л','е','с'};
        char[] sub = {'р','и','в','е','т',',',' ','л','е','с'};

        System.out.println(contains(sub, arr));
    }
}
