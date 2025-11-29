package myPackage.firstPackage;

public class Protection {
    public int number_public = 1;
    protected int number_protected = 2;
    int number_default = 3;
    private int number_private = 4;

    public void printAll() {
        System.out.println(number_public);
        System.out.println(number_protected);
        System.out.println(number_default);
        System.out.println(number_private);
    }
}
