package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInMountainArrayTest {
    @Test
    void Test1(){
        assertEquals(1,LeetCode.peakIndexInMountainArray(new int[]{0,1,0}));
    }
    @Test
    void Test2(){
        assertEquals(1,LeetCode.peakIndexInMountainArray(new int[]{0,2,1,0}));
    }
    @Test
    void Test3(){
        assertEquals(1,LeetCode.peakIndexInMountainArray(new int[]{0,10,5,2}));
    }
}