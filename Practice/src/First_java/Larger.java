package First_java;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first num: ");
        float num1 = input.nextFloat();

        System.out.println("enter the second num: ");
        float num2 = input.nextFloat();

        if (num1 > num2){
            System.out.println(num1 + "is greater.");
        }else if (num2 > num1){
            System.out.println(num2 + "is greater. ");
        }else {
            System.out.println(num1 + "and" + num2 + "are equal.");
        }

    }
}
