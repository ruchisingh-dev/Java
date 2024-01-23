package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {
    @Test
    void Test1() {
        assertArrayEquals(new int[]{1,2},SearchingLeetcode.twoSumII(new int[]{2,7,11,15}, 9));
    }
    @Test
    void Test2() {
        assertArrayEquals(new int[]{1,3},SearchingLeetcode.twoSumII(new int[]{2,3,4}, 6));
    }
    @Test
    void Test3() {
        assertArrayEquals(new int[]{1,2},SearchingLeetcode.twoSumII(new int[]{-1,0}, -1));
    }
}