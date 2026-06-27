package factory.method;

import factory.simple.PayPalPayment;
import factory.simple.Payment;

public class PayPalPaymentProcessor extends PaymentProcessor{
    private final String email;

    public PayPalPaymentProcessor(String email) {
        this.email = email;
    }

    @Override
    public Payment createPayment(double amount) {
        return new PayPalPayment(amount, email);
    }
}
