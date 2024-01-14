package org.example.Condition_loops;

import java.util.Arrays;

public class countNums {
    public static void main(String[] args) {
        int n = 13453;
        int count = 0;

        while (n > 0) {
            long rem = n % 10;
//            if (rem == 3) {
                count++;
//            }
            n = n / 10;
        }
        System.out.println(count);

//        System.out.println(Arrays.toString(countArray(new int[]{12, 1234, 1, 2})));
//        System.out.println(countDigits(1234));
    }


    public static int countDigits(int number) {
        if (number == 0) {
            return 1; // 0 has one digit
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }


}
