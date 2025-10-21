package com.excercise.coding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Integer to Roman Test")
public class IntegerToRomanTest {

    IntegerToRoman integerToRoman;
    int[] inputValues = {3749, 58, 1994};
    String[] outputExpected = {"MMMDCCXLIX", "LVIII", "MCMXCIV"};

    @BeforeEach
    void setUp() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    @DisplayName("Should perform Integer to Roman conversion number")
    void testIntegerToRoman() {
        setUp();
        String[] resultString = new String[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            resultString[i] = integerToRoman.intToRoman(inputValues[i]);
            System.out.println(resultString[i]);
        }
        assertArrayEquals(outputExpected, resultString, "Arrays Should be equals");
    }

}
