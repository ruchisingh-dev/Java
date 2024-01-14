package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatedBSTest {
    @Test
    void Test1(){
        assertEquals(4,LeetCode.rotatedBS(new int[]{4,5,6,7,0,1,2}, 0));
    }
    @Test
    void Test2(){
        assertEquals(-1,LeetCode.rotatedBS(new int[]{4,5,6,7,0,1,2}, -1));
    }
    @Test
    void Test3(){
        assertEquals(-1,LeetCode.rotatedBS(new int[]{1}, 0));
    }

}