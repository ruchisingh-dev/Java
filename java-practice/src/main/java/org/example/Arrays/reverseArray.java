package org.example.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.example.Arrays.swapArray.swap;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 432, 322, 42, 53};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }
}
