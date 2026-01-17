package training.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum OrderStatus {
    DELIVERED("Доставлен", true, Collections.emptyList()),
    CANCELLED("Отменен", true, Collections.emptyList()),
    SHIPPED("Отправлен", false, Arrays.asList(DELIVERED, CANCELLED)),
    PROCESSING("В обработке", false, Arrays.asList(SHIPPED, CANCELLED)),
    PAID("Оплачен", false, Arrays.asList(PROCESSING, CANCELLED)),
    PAYMENT_PENDING("Ожидает оплаты", false, Arrays.asList(PAID, CANCELLED)),
    CREATED("Создан", false, Arrays.asList(PAYMENT_PENDING, CANCELLED)),
    RETURN_REQUESTED("Возвращен отправителю", false, Arrays.asList(DELIVERED, CANCELLED));

    private final String displayName;
    private final boolean isFinal;
    private final List<OrderStatus> allowedTransitions;

    OrderStatus(String displayName, boolean isFinal, List<OrderStatus> allowedTransitions) {
        this.displayName = displayName;
        this.isFinal = isFinal;
        this.allowedTransitions = allowedTransitions;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public List<OrderStatus> getAllowedTransitions() {
        return allowedTransitions;
    }

    public boolean canTransitionTo(OrderStatus newStatus) {
        return allowedTransitions.contains(newStatus);
    }

    public String getTransitionInfo() {
        if (allowedTransitions.isEmpty()) {
            return "Переходов нет - финальный статус";
        }

        StringBuilder transitions = new StringBuilder("Можно перейти в: ");

        for (int i = 0; i < allowedTransitions.size(); i++) {
            transitions.append(allowedTransitions.get(i).getDisplayName());

            if (i < allowedTransitions.size() - 1) {
                transitions.append(", ");
            }
        }

        return  transitions.toString();
    }

    public static OrderStatus fromDisplayName(String name) {
        if (name == null) {
            return null;
        }

        for (OrderStatus status : OrderStatus.values()) {
            if (status.getDisplayName().equalsIgnoreCase(name)) {
                return status;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        OrderStatus currentStatus = OrderStatus.PAID;

        System.out.println("Текущий статус: " + currentStatus.getDisplayName());
        System.out.println(currentStatus.getTransitionInfo());
        System.out.println("Можно перейти в 'Доставлен'? " + currentStatus.canTransitionTo(DELIVERED));
        System.out.println("Можно перейти в 'Отменён'? " + currentStatus.canTransitionTo(CANCELLED));

        OrderStatus foundStatus = fromDisplayName("Доставлен");
        if (foundStatus != null) {
            System.out.println("Найден статус: " + foundStatus.getDisplayName());
        } else {
            System.out.println("Статус 'Доставлен' не найден.");
        }

        System.out.println("\n ---Все статусы---");
        for(OrderStatus status : OrderStatus.values()) {
            String finalStatus = status.isFinal() ? "финальный" : "не финальный";
            int transitionsCount = status.getAllowedTransitions().size();

            System.out.printf(
                    "%s (%s), переходов: %d%n",
                    status.getDisplayName(), finalStatus, transitionsCount
            );
        }
    }

}
