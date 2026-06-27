package factory.simple;

public class PaymentFactory {
    public static Payment createPayment(String type, double amount, String identifier) {
        return switch (type.toLowerCase()) {
            case "card" -> new CardPayment(amount, identifier);
            case "paypal" -> new PayPalPayment(amount, identifier);
            case "crypto" -> new CryptoPayment(amount, identifier);
            default -> throw new IllegalArgumentException("Unknown payment type: " + type);
        };
    }

    // Перегруженный метод для создания без идентификатора
    public static Payment createPayment(String type, double amount) {
        return createPayment(type, amount, "default");
    }
}
