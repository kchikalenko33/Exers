package factory.abstracts;

import factory.simple.*;

public class CardFactory implements PaymentFactory{
    private final String cardNumber;

    public CardFactory(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public Payment createPayment(double amount) {
        return new CardPayment(amount, cardNumber);
    }

    @Override
    public Receipt createReceipt(Payment payment) {
        return new CardReceipt(payment);
    }

    @Override
    public Refund createRefund(Payment payment) {
        return new CardRefund(payment);
    }
}
