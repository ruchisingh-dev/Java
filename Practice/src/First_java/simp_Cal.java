package First_java;

import java.util.Scanner;

public class simp_Cal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first num: ");
        int num1 = input.nextInt();

        System.out.println("enter the second num: ");
        int num2 = input.nextInt();

        System.out.println("type an operator (* / - +): ");
        String operator = input.next();

        if (operator.equals("+")) {
            int addition = num1 + num2;
            System.out.println("addition is: " + addition);
        } else if (operator.equals("-")) {
            int subtraction = num1 - num2;
            System.out.println("subtraction is: " + subtraction);
        }else if (operator.equals("*")) {
            int product = num1 * num2;
            System.out.println("product is: " + product);
        } else if (operator.equals("/")) {
            int division = num1 / num2;
            System.out.println("division is: " + division);
        }else {
            System.out.println("Enter a valid operator!!");
        }

    }
}
