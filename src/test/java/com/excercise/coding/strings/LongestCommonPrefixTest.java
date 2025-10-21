package com.excercise.coding.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Longest Common Prefix Test")
public class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix;
    String[] strs1 = {"flower", "flow", "flight"}; //fl
    String[] strs2 = {"dog", "racecar", "car"}; // empty
    String[] strs3 = {"a"}; // a

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    @DisplayName("Should return fl")
    void testLongestCommonPrefixTC01() {
        setUp();
        String prefix = longestCommonPrefix.longestCommonPrefix(strs1);
        assertEquals("fl", prefix, "Strings should be equal");
    }

    @Test
    @DisplayName("Should return empty String")
    void testLongestCommonPrefixTC02() {
        setUp();
        String prefix = longestCommonPrefix.longestCommonPrefix(strs2);
        assertEquals("", prefix, "Strings should be equal");
    }

    @Test
    @DisplayName("Should return a")
    void testLongestCommonPrefixTC03() {
        setUp();
        String prefix = longestCommonPrefix.longestCommonPrefix(strs3);
        assertEquals("a", prefix, "Strings should be equal");
    }

}
