package netology.task4_4_1;

import training.comparator.product.PriceComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printMenu();

        String id = scanner.nextLine();

        WishService wishService = new WishService();

        for (Wish wish : createDemoWishes()) {
            wishService.add(wish);
        }

        switch (id) {
            case "1":
                wishService.sortPriceAsc();
                break;
            case "2":
                wishService.sortPriceDesc();
                break;
            case "3":
                wishService.sortPriorityAsc();
                break;
            case "4":
                wishService.sortPriorityDesc();
                break;
            default:
                System.out.println("Неверный идентификатор сортировки. Используется сортировка по приоритету (от низкого).");
                break;
        }


        printWishlist(wishService.getWishList());

    }
    private static void printMenu() {
        System.out.println("Выберите тип сортировки для Wishlist");
        System.out.println("1. Сортировка по убыванию цены");
        System.out.println("2. Сортировка по возрастанию цены");
        System.out.println("3. Сортировка по приоритету от самого важного");
        System.out.println("4. Сортировка по приоритету от низкого приоритета");
        System.out.print("Введите идентификатор сортировки: ");
    }

    private static List<Wish> createDemoWishes() {
        List<Wish> demoWishes = new ArrayList<>();
        demoWishes.add(new Wish("Ноутбук", "Игровой ноутбук", 80000,
                "https://example.com/laptop", 5));
        demoWishes.add(new Wish("Смартфон", "Флагманский смартфон", 60000,
                "https://example.com/phone", 4));
        demoWishes.add(new Wish("Наушники", "Беспроводные наушники", 10000,
                "https://example.com/headphones", 3));
        demoWishes.add(new Wish("Планшет", "Планшет для работы", 30000,
                "https://example.com/tablet", 2));
        demoWishes.add(new Wish("Часы", "Умные часы", 15000,
                "https://example.com/watch", 1));
        demoWishes.add(new Wish("Фотоаппарат", "Зеркальный фотоаппарат", 50000,
                "https://example.com/camera", 5));
        demoWishes.add(new Wish("Клавиатура", "Механическая клавиатура", 7000,
                "https://example.com/keyboard", 3));
        demoWishes.add(new Wish("Мышь", "Игровая мышь", 5000,
                "https://example.com/mouse", 2));
        demoWishes.add(new Wish("Монитор", "4K монитор", 40000,
                "https://example.com/monitor", 4));
        demoWishes.add(new Wish("Принтер", "Лазерный принтер", 20000,
                "https://example.com/printer", 1));
        return demoWishes;
    }

    private static void printWishlist(Set<Wish> wishlist) {
        System.out.println("\nВаш список:");
        for (Wish wish : wishlist) {
            System.out.println(wish);
        }
    }

}
