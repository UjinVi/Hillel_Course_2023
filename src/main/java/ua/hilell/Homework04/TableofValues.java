package ua.hilell.Homework04;

public class TableofValues {
    public static void main(String[] args) {
        for (int x = 0; x <= 360; x += 10) {
            double radians = Math.toRadians(x);
            double sin = Math.sin(radians);
            System.out.printf("%d\t%.4f%n", x, sin);
        }
    }
}

