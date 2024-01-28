package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPerfectSquareTest {
    @Test
    void Test1() {
        assertTrue(SearchingLeetcode.isPerfectSquare(16));
    }
    @Test
    void Test2() {
        assertFalse(SearchingLeetcode.isPerfectSquare(12));
    }

}