package com.excercise.coding.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ValidAnagramTest")
public class ValidAnagramTest {

    ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    @DisplayName("sould eval if are Anagrams Positive case")
    void testValidAnagramTC01() {
        setUp();
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    @DisplayName("sould eval if are Anagrams Negative case")
    void testValidAnagramTC02() {
        String s = "rat";
        String t = "car";
        assertFalse(validAnagram.isAnagram(s, t));
    }

    @Test
    @DisplayName("sould eval if are Anagrams Positive case using HashMap")
    void testValidAnagramTC03() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagramWithHashMap(s, t));
    }

    @Test
    @DisplayName("sould eval if are Anagrams Negative case using HashMap")
    void testValidAnagramTC04() {
        String s = "rat";
        String t = "car";
        assertFalse(validAnagram.isAnagramWithHashMap(s, t));
    }
}
