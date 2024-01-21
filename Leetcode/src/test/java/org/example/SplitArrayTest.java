package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitArrayTest {
    @Test
    void Test1(){
        assertEquals(18,LeetCode.splitArray(new int[]{7,2,5,10,8}, 2));
    }
    @Test
    void Test2(){
        assertEquals(9,LeetCode.splitArray(new int[]{1,2,3,4,5}, 2));
    }
}