package com.excercise.coding.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LongestSubstringWithoutRepeatingCharactersTest")
public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters cl;
    String[] input = {"pwwkew", "bbbbb", "abcabcbb", " ", "", "au"};
    Integer[] expected = {3, 1, 3, 1, 0, 2};

    @BeforeEach
    void setUp() {
        cl = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    @DisplayName("Should perform find the longest substring withouh repeating chars")
    void testLongestCommonPrefixTC01() {
        setUp();
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], cl.lengthOfLongestSubstring(input[i]));
        }
    }
}
