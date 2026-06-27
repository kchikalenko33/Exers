package factory.simple;

public class CryptoPayment implements Payment {
    private final double amount;
    private final String walletAddress;

    public CryptoPayment(double amount, String walletAddress) {
        this.amount = amount;
        this.walletAddress = walletAddress;
    }

    @Override
    public void process() {
        System.out.println("Processing crypto payment: " + amount +
                " to: " + walletAddress);
    }

    @Override
    public double getAmount() { return amount; }
}
