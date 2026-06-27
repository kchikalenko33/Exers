package factory.simple;

public class PayPalPayment implements Payment {
    private final double amount;
    private final String email;

    public PayPalPayment(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    @Override
    public void process() {
        System.out.println("Processing PayPal payment: " + amount +
                " from: " + email);
    }

    @Override
    public double getAmount() { return amount; }
}
