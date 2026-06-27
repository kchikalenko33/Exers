package factory.simple;

public class CardRefund implements Refund{
    public CardRefund(Payment payment) {

    }

    @Override
    public void process() {

    }

    @Override
    public double getAmount() {
        return 0;
    }
}
