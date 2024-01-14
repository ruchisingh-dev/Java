package org.example.First_java;

import java.util.Scanner;

public class simple_int {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principle: ");
        long principle = input.nextLong();

        System.out.println("enter the rate: ");
        int rate = input.nextInt();

        System.out.println("enter the time: ");
        int time = input.nextInt();

        long simple_Int = (principle * rate * time) / 100;

        System.out.println("simple interest is " + simple_Int);
    }
}
