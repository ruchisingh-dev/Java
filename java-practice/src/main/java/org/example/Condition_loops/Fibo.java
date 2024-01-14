package org.example.Condition_loops;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int previous = 0;
        int current = 1;
        int count = 3;

        while (count <= n){
            int temp = current;
            current = current + previous;
            previous = temp;
            count++;
        }

        System.out.println(current);
    }
}
