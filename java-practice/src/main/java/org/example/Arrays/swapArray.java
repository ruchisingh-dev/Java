package org.example.Arrays;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        swap(arr, arr[1], arr[2]);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
