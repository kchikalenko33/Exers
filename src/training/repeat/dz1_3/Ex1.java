package training.repeat.dz1_3;

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int res = i * j;
                System.out.println(i + " x " + j + " = " + res);
            }
            System.out.println("______________");
        }
    }
}
