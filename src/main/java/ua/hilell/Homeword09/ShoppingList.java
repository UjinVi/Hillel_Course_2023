package ua.hilell.Homeword09;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ShoppingList {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = generateRandomShoppingList(10);

        System.out.println("Список покупок:");
        printShoppingList(shoppingList);

        int totalQuantity = calculateTotalQuantity(shoppingList);
        System.out.println("Общее количество товаров: " + totalQuantity);
    }

    private static Map<String, Integer> generateRandomShoppingList(int size) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Random random = new Random();

        String[] products = {"Молоко", "Хлеб", "Яйца", "Мясо", "Овощи", "Фрукты", "Сок", "Кофе", "Чай", "Сахар"};

        for (int i = 0; i < size; i++) {
            String product = products[random.nextInt(products.length)];
            int quantity = random.nextInt(5) + 1; // Случайное колличество от 1 до 5

            if (shoppingList.containsKey(product)) {
                quantity += shoppingList.get(product); // Добавить к существующему колличеству, если товар уже есть в списке
            }

            shoppingList.put(product, quantity);
        }

        return shoppingList;
    }

    private static int calculateTotalQuantity(Map<String, Integer> shoppingList) {
        int totalQuantity = 0;

        for (int quantity : shoppingList.values()) {
            totalQuantity += quantity;
        }

        return totalQuantity;
    }

    private static void printShoppingList(Map<String, Integer> shoppingList) {
        for (Map.Entry<String, Integer> entry : shoppingList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

