package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqrtTest {
    @Test
    void Test1() {
        assertEquals(2, SearchingLeetcode.mySqrt(4));
    }
    @Test
    void Test2() {
        assertEquals(2, SearchingLeetcode.mySqrt(8));
    }
    @Test
    void Test3() {
        assertEquals(5, SearchingLeetcode.mySqrt(25));
    }
}