package factory.method;

import factory.simple.CardPayment;
import factory.simple.Payment;

public class CardPaymentProcessor extends PaymentProcessor {
    private final String cardNumber;

    public CardPaymentProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public Payment createPayment(double amount) {
        return new CardPayment(amount, cardNumber);
    }
}
