package factory.abstracts;

import factory.simple.Payment;
import factory.simple.Receipt;
import factory.simple.Refund;

public interface PaymentFactory {
    Payment createPayment(double amount);
    Receipt createReceipt(Payment payment);
    Refund createRefund(Payment payment);
}
