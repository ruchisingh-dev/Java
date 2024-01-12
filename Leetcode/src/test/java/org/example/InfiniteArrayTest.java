package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class InfiniteArrayTest {
    @Test
    void Test1(){
        assertEquals(4, LeetCode.infiniteArray(new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170}, 10));
    }

}