package sealed.example2;

public final class CryptoWallet implements PaymentMethod {
    final String walletAddress;

    public CryptoWallet(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        validate();
        System.out.printf("Отправка %.6f BTC на адрес %s%n", amount, walletAddress);
    }
}
