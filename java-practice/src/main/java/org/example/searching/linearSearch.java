package org.example.searching;


import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
//        int[] nums = {23, 45, 12, 67, -12, 56, 34, -23, -34};
//        int target = 23;
//        int start = 2;
//        int end = 6;
//        System.out.println(findMin(nums));
//        System.out.println(searchInRange(nums, target, start, end));
//        int ans = linearsearch(nums, target);
//        System.out.println(ans);
//        String name = "Ruchi";
//        char target = 'u';
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(searchString2(name, target));

        int[][] arr = {
                {23, 4, 42},
                {56, 45, 67},
                {22, 67}
        };
        int target = 67;
        int[] ans = search2DArray(arr, target);
        System.out.println(Arrays.toString(ans));


    }
    static int[] search2DArray(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int findMin(int[] arr){
        int ans = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        // for loop
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
    static boolean searchString2(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchString(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }




    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}