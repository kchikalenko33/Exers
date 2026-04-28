package serialization;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");

        SerializatorCat serializatorCat = new SerializatorCat();
        System.out.println(serializatorCat.serialization(cat));
    }
}
