package training.classes.task1;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, double weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Звонит - " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит - " + name + "\nНомер - " + number);
        System.out.println("Мой номер -" + this.number);
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Сообщение - " + message + " отправлено на номера - ");
        System.out.println(Arrays.toString(numbers));
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
