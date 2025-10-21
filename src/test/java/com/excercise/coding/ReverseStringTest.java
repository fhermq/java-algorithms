package com.excercise.coding;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Reverse String Test")
public class ReverseStringTest {

    ReverseString reverseString;

    @BeforeEach()
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    @DisplayName("Should reverse the first char array")
    void testReverseStringTC01() {
        setUp();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        char[] result;
        result = reverseString.reverseStringChar(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Should reverse the second char array")
    void testReverseStringTC02() {
        setUp();
        char[] input = {'h', 'a', 'n', 'n', 'a', 'H'};
        char[] expected = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] result;
        result = reverseString.reverseStringChar(input);
        assertArrayEquals(expected, result);

    }

    @Test
    @DisplayName("Should perform the method")
    void testReverseStringTC03() {
        setUp();
        char[] input = {'h', 'a', 'n', 'n', 'a', 'H'};
        // char[] expected = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(input);
        
    }
}
