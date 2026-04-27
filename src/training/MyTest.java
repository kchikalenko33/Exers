package training;

public class MyTest {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sale(int a) {
        if (a > 1000) {
            return a * 0.8;
        } else if (a > 100) {
            return a * 0.9;
        }
        return a;
    }

    public boolean isEven(int a) {
       return a % 2 == 0;
    }

    public String toUp(String input) {
        return input.toUpperCase();
    }

    public int sumArray(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public int[] multipleArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] *= num[i];
        }
        return num;
    }
}
