package ua.hilell.Homework03;

public class TriangleCheck {
    public static void main(String[] args) {
         double side1 = 5;
         double side2 = 7;
         double side3 = 5;

       if (side1 == side2 || side1 == side3 || side2 == side3) {
           System.out.println("The triangle is isosceles.");
       } else {
           System.out.println("The triangle is not isosceles.");
            }
        }
}
