package BroCode;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
//        double x = 3.453;
//        double y = 10;

//        double z = Math.max(x, y);
//        double z = Math.abs(y);
//        double z = Math.sqrt(y);
//        System.out.println(z);

        // finding hypotnias of a triangle
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the perpendicular of the triangle: ");
        a = input.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        b = input.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("the value of hypotneas is: " + c);
    }
}
