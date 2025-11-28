package sber.dz3_part1.task6;

public class AmazingString {
    private char[] arr;

    public AmazingString(char[] arr) {
        this.arr = arr;
    }

    public AmazingString(String arrays) {
        arr = arrays.toCharArray();
    }

    public int length() {
        return arr.length;
    }

    public void printString() {
        System.out.println(arr);
    }

    public char indexAt(int index) {
        return arr[index];
    }

    public void reverseString() {
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public void trim() {
        int firstIndex = -1;
        int lastIndex = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                firstIndex = i;
                break;
            }
        }

        for (int i = arr.length - 1; i > firstIndex; i--) {
            if (arr[i] != ' ') {
                lastIndex = i;
                break;
            }
        }

        char[] trim = new char[lastIndex - firstIndex + 1];
        for (int i = 0; i < trim.length; i++) {
            trim[i] = arr[i + firstIndex];
        }

        arr = trim;
    }

    public boolean contains(char[] sub) {
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

    public boolean contains(String sub) {
        char[] chars = new char[sub.length()];

        for (int i = 0; i < sub.length(); i++) {
            chars[i] = sub.charAt(i);
        }

        return contains(chars);
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'b'};
        System.out.println(ch);

        AmazingString a = new AmazingString("        Helwo   ");
        // a.reverseString();
        System.out.println(a.contains("lwo"));
        a.trim();
        a.printString();

    }
}
