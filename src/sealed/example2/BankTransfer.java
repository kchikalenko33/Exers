package sealed.example2;

public non-sealed class BankTransfer implements PaymentMethod {
    final String accountNumber;

    public BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(double amount) {
        validate();
        System.out.printf("Перевод %.2f руб. на счёт %s%n", amount, accountNumber);
    }

    public void generateReceipt() {
        System.out.println("Квитанция сформирована.");
    }
}
