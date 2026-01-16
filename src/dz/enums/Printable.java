package dz.enums;

public interface Printable {
    void print();
}

    enum Color implements Printable {
    RED, GREEN, BLUE;

    @Override
    public void print() {
        System.out.println(this.name().toLowerCase());
    }
}
