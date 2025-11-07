package practical_lesson.second_lesson;

public class FourthExercise {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int sum = 0;
        int def = 1;

        for (int i = 1; i <= n; i++) {
            def = def * m;
            System.out.println("def = " + def);
            sum += def;
            System.out.println("sum = " + sum);
        }

        int q = 678;
        int copyQ = q;
        int a = 0;
        int reversed = 0;

        while (copyQ > 0) {
            a = copyQ % 10;
            reversed = reversed * 10 + a;
            copyQ = copyQ / 10;
        }
        System.out.println(reversed);

        while (q > 10) {
            a = q % 10;
            q = q / 10;
            System.out.println(a);
        }

        System.out.println(q);

        int s = 3;
        int d = 9;

        int divider = s % d;
        System.out.println("divider = " + divider);

    }
}
