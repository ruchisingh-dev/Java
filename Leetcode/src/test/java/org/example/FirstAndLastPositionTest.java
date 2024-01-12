package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastPositionTest {
    @Test
    void Test1(){
        assertArrayEquals(new int[]{3, 4}, LeetCode.firstAndLastPosition(new int[]{5,7,7,8,8,10}, 8));
    }
    @Test
    void Test2(){
        assertArrayEquals(new int[]{-1, -1}, LeetCode.firstAndLastPosition(new int[]{5,7,7,8,8,10}, 6));
    }
    @Test
    void Test3(){
        assertArrayEquals(new int[]{-1, -1}, LeetCode.firstAndLastPosition(new int[]{ }, 0));
    }
}