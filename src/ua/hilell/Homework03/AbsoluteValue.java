package ua.hilell.Homework03;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();

            int absValue1 = Math.abs(number1);
            int absValue2 = Math.abs(number2);

            if (absValue1 > absValue2) {
                System.out.println(number1 + " Greater absolute value than " + number2);
            } else if (absValue2 > absValue1) {
                System.out.println(number2 + " Greater absolute value than " + number1);
            } else {
                System.out.println("Both numbers have the same absolute value");}
        }
    }
