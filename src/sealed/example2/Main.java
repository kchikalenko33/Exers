package sealed.example2;

public class Main {
    public static void main(String[] args) {
        PaymentMethod card = new CreditCard("4111-1111-1111-1111", "Alice");
        PaymentMethod transfer = new BankTransfer("ACC-001");
        PaymentMethod crypto = new CryptoWallet("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        // Обработка платежей
        card.processPayment(1500.50);
        transfer.processPayment(5000.00);
        crypto.processPayment(0.005);

        // Использование статического метода интерфейса
        PaymentMethod defaultMethod = PaymentMethod.getDefaultMethod();
        defaultMethod.processPayment(100.0);

        // Специфичный метод BankTransfer (проверка типа обязательна)
        if (transfer instanceof BankTransfer) {
            ((BankTransfer) transfer).generateReceipt();
        }

        // Вызов метода для описания типа платежа
        describePaymentType(card);
        describePaymentType(transfer);
        describePaymentType(crypto);
    }

    private static void describePaymentType(PaymentMethod method) {
        switch (method) {
            case CreditCard c -> System.out.println("Платёж по кредитной карте: " + c.ownerName);
            case BankTransfer b -> System.out.println("Банковский перевод на счёт: " + b.accountNumber);
            case CryptoWallet w -> System.out.println("Криптокошелёк: " + w.walletAddress);
            // default не нужен: компилятор знает, что других вариантов нет
        }
    }
}
