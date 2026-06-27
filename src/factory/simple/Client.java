package factory.simple;

public class Client {
    public static void main(String[] args) {
        Payment cardPayment = PaymentFactory.createPayment("card", 100.0, "1234-5678");
        cardPayment.process();

        Payment paypalPayment = PaymentFactory.createPayment("paypal", 50.0, "user@example.com");
        paypalPayment.process();

        Payment cryptoPayment = PaymentFactory.createPayment("crypto", 200.0, "0x123...");
        cryptoPayment.process();
    }
}
