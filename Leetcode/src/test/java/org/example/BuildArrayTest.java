package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayTest {
    @Test
    void Test1() {
        assertArrayEquals(new int[]{0,1,2,4,5,3},LeetCode.BuildArray(new int[]{0,2,1,5,3,4}));
    }
    @Test
    void Test2() {
        assertArrayEquals(new int[]{4,5,0,1,2,3},LeetCode.BuildArray(new int[]{5,0,1,2,3,4}));
    }
}