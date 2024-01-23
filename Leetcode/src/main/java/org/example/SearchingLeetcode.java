package org.example;

public class SearchingLeetcode {
    static int mySqrt(int x) {
//        https://leetcode.com/problems/sqrtx/description/
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int end = x;
        int result = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                // if mid * mid is less than or equal to x, then update the result, and search in right half
                result = mid;
                start = mid + 1;
            }else {
                // if mid * mid is greater than or equal to x , then search in left half
                end = mid - 1;
            }
        }
        return result;
    }
    static int[] twoSumII(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while ( start < end){
            int sum = numbers[start] + numbers[end];
            if (sum == target){
                // ATQ - add one to indices
                return new int[]{start+1, end+1};
            }else if (sum < target){
                // if target is greater than sum, move start to left
                start++;
            }else {
                // if target is less than sum move, end to right
                end--;
            }
        }
        return new int[]{-1, -1};
    }

}
