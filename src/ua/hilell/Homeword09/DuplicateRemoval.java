package ua.hilell.Homeword09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DuplicateRemoval {
    public static void main(String[] args) {
        List<Integer> collection = generateRandomCollection(100, 50);

        System.out.println("Начальная коллекция:");
        printCollection(collection);

        List<Integer> uniqueCollection = removeDuplicates(collection);

        System.out.println("Колекция без дубликатов:");
        printCollection(uniqueCollection);

        int numDuplicatesRemoved = collection.size() - uniqueCollection.size();
        System.out.println("Коллекция удаленных дубликов: " + numDuplicatesRemoved);
    }

    private static List<Integer> generateRandomCollection(int size, int limit ) {
        List<Integer> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt(limit));
        }

        return collection;
    }

    private static List<Integer> removeDuplicates(List<Integer> collection) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : collection) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }

    private static void printCollection(List<Integer> collection) {
        for (int num : collection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
