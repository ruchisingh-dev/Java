package org.example;

import java.util.*;

public class LeetCode {

    // arrays leetcode
    static int[] ConcatArr(int[] num) {
        // https://leetcode.com/problems/concatenation-of-array/
        int n = num.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = num[i];
            ans[i + n] = num[i];
        }
        return ans;
    }

    static int RichestWealth(int[][] Accounts) {
        //https://leetcode.com/problems/richest-customer-wealth/description/
        int max = 0;
        for (int[] account : Accounts) {
            int cs = 0;
            for (int i : account) {
                cs += i;
            }
            max = Integer.max(max, cs);
        }
        return max;
    }

    static int GoodPairs(int[] nums) {
        // https://leetcode.com/problems/number-of-good-pairs/
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

    static int[] RunningSum(int[] nums) {
//        https://leetcode.com/problems/running-sum-of-1d-array/
        int n = nums.length;
        int[] runinSum = new int[n];
        runinSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            runinSum[i] = runinSum[i - 1] + nums[i];
        }
        return runinSum;

    }
    static int[][] Transpose(int[][] matrix){
        // https://leetcode.com/problems/transpose-matrix/
        int row = matrix.length;
        int cols = matrix[0].length;
        int[][] mat2 = new int[cols][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[j][i] = matrix[i][j];
            }
        }

        return mat2;
    }

    static int[] BuildArray(int[] nums){
        // https://leetcode.com/problems/build-array-from-permutation/
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    static int[] ShuffleArray(int[] num,  int n){
        // https://leetcode.com/problems/shuffle-the-array/
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = num[i];
            arr[2 * i + 1] = num[i + n];
        }
        return arr;
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
        List<Boolean> ans = new ArrayList<>();
        int max = maximumValueIndex(candies);
        for (int candy : candies) {
            if (candy + extraCandies >= candies[max]) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
    static int maximumValueIndex(int[] arr){

        int max = arr[0];//max value
        int index = 0;
        for(int item:arr){
            max = Integer.max(max,item);
        }
        for(int item:arr){
            if(item == max) break;
            index++;
        }
        return index;
    }

        static public int findNumbers(int[] nums) {
//            https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
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
            return (int)(Math.log10(num) + 1);
        }

    static int[] smallerNumbersThanCurrent(int[] nums) {
//        https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    // binary search leetcode
    static char nextGreatestLetter(char[] letters, char target) {
//      https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    static int[] firstAndLastPosition(int[] nums, int target) {
        // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex){
        // this function just return the index value of target
        int ans = -1;
        int[] arr = new int[2];
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start);
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                // potential ans is found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
    static int infiniteArray(int[] arr, int target){
        // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
        int start = 0;
        int end = 1;

        // Adjusted condition to avoid going beyond the array length
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        // basic binary search function
        while (start <= end && start < arr.length) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr) {
//        https://leetcode.com/problems/peak-index-in-a-mountain-array/
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                // you are in decreasing part of array
                // this may be the ans but look at left
                // this is why end != mid - 1
                end = mid;
            }else {
                // you are in ascending part of the array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks
        // start and end are always trying to find mmax element in the above 2 checks
        // hence when they are pointing to just one element, that is the max one because that is what the checks ay
        // more eleboration at every point of time of start and end they have the best possible answer till that time
        // and if we are saying that only item is remaining, hence cuz of the above line that is the best possible ans
        return start; // or end as both are equal
    }

}
