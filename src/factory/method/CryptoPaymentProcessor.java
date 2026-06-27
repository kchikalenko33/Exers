package factory.method;

import factory.simple.CryptoPayment;
import factory.simple.Payment;

public class CryptoPaymentProcessor extends PaymentProcessor{
    private final String walletAddress;

    public CryptoPaymentProcessor(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public Payment createPayment(double amount) {
        return new CryptoPayment(amount, walletAddress);
    }
}
