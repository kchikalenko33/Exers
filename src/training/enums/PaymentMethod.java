package training.enums;

public enum PaymentMethod {
    CREDIT_CARD("Кредитная карта", 2.5, true),
    DEBIT_CARD("Банковская карта", 3.5, true),
    PAYPAL("ПэйПал", 1.5, true),
    BANK_TRANSFER("Банковский перевод", 0.5, false),
    CASH("Наличный расчет", 0, false);

    private final String displayName;
    private final double feePercent;
    private final boolean onlineOnly;

    PaymentMethod(String displayName, double feePercent, boolean onlineOnly) {
        this.displayName = displayName;
        this.feePercent = feePercent;
        this.onlineOnly = onlineOnly;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public double getFreePercent() {
        return this.feePercent;
    }

    public boolean isOnlineOnly() {
        return this.onlineOnly;
    }

    public double calculateFee(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }

        return amount * this.feePercent / 100;
    }

    public boolean acceptsAmount(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (this == BANK_TRANSFER) {
            return amount >= 1000;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Способ оплаты: " + displayName + "; комиссия: " + feePercent + "%"
                + "; онлайн: " + (onlineOnly ? "да" : "нет");
    }

    public static void main(String[] args) {
        for (PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method);
            System.out.println("Комиссия для 5000 руб.: " + method.calculateFee(5000) + " руб.");
            System.out.println("Принимает 500 руб.: " + method.acceptsAmount(500));
            System.out.println();
        }
    }
}
