package sealed.example2;

public final class CreditCard implements PaymentMethod{
    private final String cardNumber;
    final String ownerName;

    public CreditCard(String cardNumber, String ownerName) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
    }

    @Override
    public void processPayment(double amount) {
        validate();
        System.out.printf("Оплата %.2f руб. с карты %s (владелец: %s)%n", amount, cardNumber, ownerName);
    }
}
