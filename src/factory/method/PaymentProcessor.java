package factory.method;

import factory.simple.Payment;

public abstract class PaymentProcessor {
    // Фабричный метод — подклассы решают, какой Payment создать
    public abstract Payment createPayment(double amount);

    // Общий алгоритм, использующий фабричный метод
    public void processPayment(double amount) {
        Payment payment = createPayment(amount);
        System.out.println("Starting payment processing...");
        payment.process();
        System.out.println("Payment completed: " + payment.getAmount());
    }
}
