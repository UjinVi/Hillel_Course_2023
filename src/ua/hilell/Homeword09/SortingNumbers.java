package ua.hilell.Homeword09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SortingNumbers {
    public static void main(String[] args) {
        List<Integer> initialCollection = generateRandomCollection(100);

        System.out.println("Начальная коллекция:");
        printCollection(initialCollection);

        Map<String, List<Integer>> sortedNumbers = sortNumbers(initialCollection);

        System.out.println("Числа которые делятся на 2:");
        printCollection(sortedNumbers.get("divisibleBy2"));

        System.out.println("Числа которые делятся 3:");
        printCollection(sortedNumbers.get("divisibleBy3"));

        System.out.println(" Другие числа:");
        printCollection(sortedNumbers.get("others"));
    }

    private static List<Integer> generateRandomCollection(int size) {
        List<Integer> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt(100));
        }

        return collection;
    }

    private static Map<String, List<Integer>> sortNumbers(List<Integer> numbers) {
        Map<String, List<Integer>> sortedNumbers = new HashMap<>();
        sortedNumbers.put("divisibleBy2", new ArrayList<>());
        sortedNumbers.put("divisibleBy3", new ArrayList<>());
        sortedNumbers.put("others", new ArrayList<>());

        for (int number : numbers) {
            if (number % 2 == 0) {
                sortedNumbers.get("divisibleBy2").add(number);
            }
            if (number % 3 == 0) {
                sortedNumbers.get("divisibleBy3").add(number);
            }
            if (number % 2 != 0 && number % 3 != 0) {
                sortedNumbers.get("others").add(number);
            }
        }

        return sortedNumbers;
    }

    private static void printCollection(List<Integer> collection) {
        for (int number : collection) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

