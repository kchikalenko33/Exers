package sealed.example2;

public sealed interface PaymentMethod permits CreditCard, BankTransfer, CryptoWallet {
    void processPayment(double amount);

    default void validate() {
        System.out.println("Проверка платежа...");
        if (!isValid()) {
            throw new IllegalStateException("Платёжный метод недействителен!");
        }
    }

    private boolean isValid() {
        return true;
    }

    static PaymentMethod getDefaultMethod() {
        return new CreditCard("1234-5678-9012-3456", "John Doe");
    }
}
