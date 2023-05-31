package ua.hilell.Homework;

public class CircleArea {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Площадь круга с радиусом " + radius + " равен " + String.format("%.2f", area));
    }
}
