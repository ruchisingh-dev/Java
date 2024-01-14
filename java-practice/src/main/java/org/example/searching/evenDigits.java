package org.example.searching;

public class evenDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 5678, 12};
        System.out.println(digit2(-34567));
    }
    static int findNumber(int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
       int numberOfDigits = digits(num);
       if (numberOfDigits % 2 == 0){
           return true;
       }
       return false;
    }
    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
    return count;
    }

    static int digit2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }
}
