package ua.hilell.Homework08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Random;

public class TaskWithAnAsteriks {
    public static void main(String[] args) {
        String[] suits = {"Черви", "Бубны", "Кресты", "Пики"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        ArrayList<String> deck = new ArrayList<String>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        try {
            Collections.shuffle(deck, new Random());

            for (int i = 1; i <= 4; i++) {
                System.out.println("Игрок " + i + " Получает карту " + deck.get(i - 1));
                System.out.println("Игрок " + i + " Получает карту " + deck.get(i + 3));
                System.out.println("Игрок " + i + " Получает карту " + deck.get(i + 7));
                System.out.println("Игрок " + i + " Получает карту " + deck.get(i + 11));
                System.out.println("Игрок " + i + " Получает карту " + deck.get(i + 15));
                System.out.println();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы списка.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: передан неверный аргумент.");
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка: операция не поддерживается.");
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка: попытка получить элемент из пустой коллекции.");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: операция над null-объектом.");
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: выполнение операции не допустимо в текущем состоянии объекта.");
        }
    }
}