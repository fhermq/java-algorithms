package com.excercise.coding;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Roman To Integers Test")
public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;
    String[] inputString = {"III","LVIII","MCMXCIV"};
    int[] outputExpected = {3, 58, 1994};


    @BeforeEach
    void setUp(){
        romanToInteger = new RomanToInteger();
    }

    @Test
    @DisplayName("Should perform conversion Roman to Integer number")
    void testRomanToInteger(){
        setUp();
        int[] result = new int[inputString.length];

        for (int i= 0; i<inputString.length; i++) {
            result[i]= romanToInteger.romanToInt(inputString[i]);
        }
        assertArrayEquals(outputExpected, result);
    }
    
}
