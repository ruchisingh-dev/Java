package org.example.searching;

public class maxWealth {
    public static void main(String[] args) {
//        https://leetcode.com/problems/richest-customer-wealth/
    }
    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
