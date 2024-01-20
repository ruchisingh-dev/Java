package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindRotationCountTest {
    @Test
    void Test1(){
        assertEquals(4,LeetCode.findRotationCount(new int[]{4,5,6,7,0,1,2}));
    }
    @Test
    void Test2(){
        assertEquals(2,LeetCode.findRotationCount(new int[]{15, 18, 2, 3, 6, 12}));
    }
    @Test
    void Test3(){
        assertEquals(4,LeetCode.findRotationCount(new int[]{7, 9, 11, 12, 5}));
    }
}