package org.example.First_java;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = input.nextInt();

        int firstnum = 0;
        int secondnum = 1;

        System.out.print(firstnum + " " + secondnum);

        for (int i = 3; i<=n; i++){
            int nextnum = firstnum + secondnum;
            System.out.print(" " + nextnum);
            firstnum = secondnum;
            secondnum = nextnum;
        }
    }
}
