package factory.method;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor processor = new CardPaymentProcessor("1234-5678");
        processor.processPayment(100.0);

        processor = new PayPalPaymentProcessor("user@example.com");
        processor.processPayment(50.0);
    }
}
