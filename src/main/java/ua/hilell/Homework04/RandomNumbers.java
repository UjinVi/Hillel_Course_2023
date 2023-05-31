package ua.hilell.Homework04;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.print("Начальный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }

        System.out.print("Измененный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}