package training;

public class Training2 {
    public static void main(String[] args) {
        short s = 1000;
        int i = s;
        byte ii = (byte) i;
        System.out.println(ii);

        double d = 123.456;
        int dd = (int) d;
        float f = ii;
        System.out.println(dd);
        System.out.println(f);

        char c = 'A';
        int cc = (int) c;
        int ccc = cc;
        System.out.println(cc);
        System.out.println(ccc);
    }
}
