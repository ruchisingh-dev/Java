package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreatestLetterTest {
    @Test
    void Test1(){
        assertEquals('c', LeetCode.nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
    }
    @Test
    void Test2(){
        assertEquals('f', LeetCode.nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
    }
    @Test
    void Test3(){
        assertEquals('x', LeetCode.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z'));
    }
}