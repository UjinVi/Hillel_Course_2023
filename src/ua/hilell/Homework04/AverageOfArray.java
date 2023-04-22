package ua.hilell.Homework04;

import java.util.Random;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.print("Массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Среднее арифметическое: " + average);
    }
}

