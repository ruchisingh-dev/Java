package org.example.First_java;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is a odd number");
        }
    }
}
