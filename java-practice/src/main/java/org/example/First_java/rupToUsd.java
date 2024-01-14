package org.example.First_java;

import java.util.Scanner;

public class rupToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency in rupees: ");
        double rupees = input.nextDouble();

        double dollors = rupees * 0.012;
        System.out.println(rupees + "rupees is equal to " + dollors + "USD");

    }
}
