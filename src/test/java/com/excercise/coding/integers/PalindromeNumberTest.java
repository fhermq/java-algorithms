package com.excercise.coding.integers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Palindrome Number Algorithm")
public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    @DisplayName("isPalindromeNumber - Should return true ")
    void testIsPalindromeNumberTrue() {
        setUp();
        int number = 12321;
        assertTrue(palindromeNumber.isPalindromeNumber(number));
        number = 121;
        assertTrue(palindromeNumber.isPalindromeNumber(number));
    }

    @Test
    @DisplayName("isPalindromeNumber - Should return false ")
    void testIsPalindromeNumberFalse() {
        setUp();
        int number = -121;
        assertFalse(palindromeNumber.isPalindromeNumber(number));
        number = 10;
        assertFalse(palindromeNumber.isPalindromeNumber(number));
    }

}
