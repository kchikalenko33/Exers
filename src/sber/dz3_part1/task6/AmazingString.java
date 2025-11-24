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
        // char temp = arr[0];

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
//        arr[0] = arr[arr.length - 1];12345
//        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'b'};
        System.out.println(ch);

        AmazingString a = new AmazingString("Helwo");
        a.reverseString();

        a.printString();
    }
}
