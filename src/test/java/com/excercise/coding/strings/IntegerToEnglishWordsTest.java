package com.excercise.coding.strings;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Integer To English Words Test")
public class IntegerToEnglishWordsTest {

    IntegerToEnglishWords integerToWords;
    int[] input = {1234567,
        123,
        12345,
        50868,
        1000000};
    String[] expectedOutput = {"One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
        "One Hundred Twenty Three",
        "Twelve Thousand Three Hundred Forty Five",
        "Fifty Thousand Eight Hundred Sixty Eight",
        "One Million"};

        @BeforeEach()
        void setUp(){
            integerToWords = new IntegerToEnglishWords();
        }

       @Test
       @DisplayName("Should return the word number")
       void testIntegerToWordInEnglish(){
            setUp();
            String[] actual = new String[expectedOutput.length];
            for(int i=0; i<input.length; i++){
                actual[i] = integerToWords.numberToWords(input[i]);
            }
            assertArrayEquals(expectedOutput, actual);

       } 
}
