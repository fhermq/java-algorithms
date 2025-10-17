package com.excercise.coding;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The Factorial Trailling Zeroes")
public class FactorialTrailingZeroesTest {

    private FactorialTrailingZeroes factorialTrailingZeroes;
    int[] input = {0, 3, 5, 10, 30, 125, 500, 777, 1000};
    int[] output = {0, 0, 1, 2, 7, 31, 124, 193, 249};

    @BeforeEach
    void setUp() {
        factorialTrailingZeroes = new FactorialTrailingZeroes();
    }

    @Test
    @DisplayName("trailingZeroes - Should return the count of trailling Zeroes Factorial")
    void testFactorialTrailingZeroes() {
        int[] actual = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            actual[i]= factorialTrailingZeroes.trailingZeroes(input[i]);
        }
        assertArrayEquals(output, actual);
    }

}
