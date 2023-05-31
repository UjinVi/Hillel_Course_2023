package ua.hilell.Homeword09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class DuplicateRemovalTwo{
    public static void main(String[] args) {
        List<Integer> collection = generateRandomCollection(100, 50);

        System.out.println("Начальная коллекция::");
        printCollection(collection);

        List<Integer> uniqueCollection = removeDuplicatesUsingSet(collection);

        System.out.println("Колекция без дубликатов:");
        printCollection(uniqueCollection);

        int numDuplicatesRemoved = collection.size() - uniqueCollection.size();
        System.out.println("Коллекция удаленных дубликов: " + numDuplicatesRemoved);
    }

    private static List<Integer> generateRandomCollection(int size, int limit) {
        List<Integer> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt(limit));
        }

        return collection;
    }

    private static List<Integer> removeDuplicatesUsingSet(List<Integer> collection) {
        Set<Integer> uniqueSet = new HashSet<>(collection);
        return new ArrayList<>(uniqueSet);
    }

    private static void printCollection(List<Integer> collection) {
        for (int num : collection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

