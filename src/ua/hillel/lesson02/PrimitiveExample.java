package ua.hillel.lesson02;

public class PrimitiveExample {
    public static void main(String[] args) {
        int i;
        i = 10;
//    i=5.4;


        byte b = 125;
        for (int j = 0; j < 5; j++) {
            System.out.println(b++);
        }

        double d = 4;
        d = 4.5;
        float f = 4.5F;

        char c = 65;
        c = 'c';
        boolean bool = true;
        bool = false;
    }
}
