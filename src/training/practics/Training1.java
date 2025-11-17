package training.practics;

public class Training1 {
    public static void main(String[] args) {

        int a = 10;
        long b = a;            // int автоматически расширяется до long
        double c = b;           // long автоматически преобразуется к float

        System.out.println("int a = " + a);
        System.out.println("long b = " + b);
        System.out.println("double c = " + c);

    }

}

