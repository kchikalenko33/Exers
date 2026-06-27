package factory.simple;

public class CardPayment  implements Payment {
    private final double amount;
    private final String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void process() {
        System.out.println("Процесс оплаты на сумму: " + amount + " с карты - " + cardNumber);
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
