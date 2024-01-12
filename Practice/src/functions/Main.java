package functions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
//        String massage = greet();
//        System.out.println(massage);
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter name: ");
//        String name = input.next();
//        String mygreet = myGreet(name);
//        System.out.println(mygreet);

        int a = 20;
        int b = 25;
//        swap(a, b);
        int[] arr = {23, 12, 56, 34};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99;
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " and " + num2);
    }

    static String myGreet(String name){
        String massage = "Hello " + name;
        return massage;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("enter number 1: ");
        num1 = in.nextInt();

        System.out.println("enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("enter number 1: ");
        num1 = in.nextInt();

        System.out.println("enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    static String greet(){
        String greeting = "How arre you?";
        return greeting;
    }
}
