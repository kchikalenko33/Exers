package training.classes.task1;

public class Main {
    public static void main(String[] args) {
        Phone myPhone = new Phone("89991112233", 100, "iPhone");
        Phone shePhone = new Phone("89991231212", 70, "tel");

        System.out.println(myPhone.getNumber());
        myPhone.receiveCall("Наташа");

        Phone hePhone = new Phone("89991234567", "Samsung");
        System.out.println(hePhone.getWeight());

        Phone iPhone = new Phone();
        iPhone.setNumber("89999998877");

        iPhone.receiveCall("Наташа", shePhone.getNumber());

        myPhone.sendMessage("Hello","89991233211", "89991234567");

    }
}
