package training.practics;

public class Tng11 {
    public static void main(String[] args) {
        int number = 12345;
        String s = String.valueOf(number);
        char[] chars = s.toCharArray();

        char temp = chars[1];
        chars[1] = chars[chars.length - 2];
        chars[chars.length - 2] = temp;

        String result = new String (chars);
        System.out.println(result);
    }
}
