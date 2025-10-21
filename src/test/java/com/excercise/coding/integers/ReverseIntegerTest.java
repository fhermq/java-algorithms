package com.excercise.coding.integers;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Reverse Integer")
public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;
    int[] input = {120,123,120};
    int[] expected = {21,321,21};

    @BeforeEach
    void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    @DisplayName("Should get the Reverse Integer")
    void testReverseInteger() {
        setUp();
        int [] actual = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            actual[i] = reverseInteger.reverse(input[i]);
        }
        assertArrayEquals(expected, actual);
    }

}
