package com.excercise.coding.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Longest Palindromic Susbtring Test")
public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeEach
    void setUp() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    @DisplayName("Should return the longest palindrom in the string")
    void testLongestCommonPrefixTC01(){
        setUp();
        String s = "babad";  //bab
        assertEquals("bab",longestPalindromicSubstring.longestPalindrome(s),"Should be equals");
    }

    @Test
    @DisplayName("Should return the longest palindrom in the string")
    void testLongestCommonPrefixTC02(){
        setUp();
        String s = "cbbd"; // cbb
        assertEquals("bb",longestPalindromicSubstring.longestPalindrome(s),"Should be equals");
    }

}
