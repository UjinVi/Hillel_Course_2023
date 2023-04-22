package ua.hilell.Homework;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.16;

        System.out.printf("%.2f C: %.2f F; %.2f K", celsius, fahrenheit, kelvin);
    }
}
