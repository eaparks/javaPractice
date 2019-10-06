package com.practice.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {

    StringPalindrome unit = new StringPalindrome();

    @Test
    void isAPalindrome() {

        assertFalse(unit.isAPalindrome("x"));
        assertFalse(unit.isAPalindrome(""));
        assertFalse(unit.isAPalindrome(null));
        assertFalse(unit.isAPalindrome("xasdfasdf"));
        assertTrue(unit.isAPalindrome("bob"));
        assertTrue(unit.isAPalindrome("boob"));
        assertTrue(unit.isAPalindrome("xbodobx"));
    }
}
