package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersTest {
    @Test
    void Test1(){
        assertEquals(2, LeetCode.findNumbers(new int[]{12,345,2,6,7896}));
    }
    @Test
    void Test2(){
        assertEquals(1, LeetCode.findNumbers(new int[]{555,901,482,1771}));
    }
}