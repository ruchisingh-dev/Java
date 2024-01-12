package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatArrayTest {
    @Test
    void Test1() {
        assertArrayEquals(new int[]{1,2,1,1,2,1},LeetCode.ConcatArr(new int[]{1,2,1}));
    }
    @Test
    void Test2() {
        assertArrayEquals(new int[]{1,3,2,1,1,3,2,1},LeetCode.ConcatArr(new int[]{1,3,2,1}));
    }
}