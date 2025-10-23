package com.excercise.coding.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Reverse Vowels Of a String Test")
public class ReverseVowelsOfAStringTest {

    ReverseVowelsOfAString reverseVowelsOfAString;

    @BeforeEach
    void setUp(){
        reverseVowelsOfAString = new ReverseVowelsOfAString();
    }

    /*
     * leetcode : leotcede
     * IceCreAm : AceCreIm
     */

    @Test
    @DisplayName("Should perform reverse Vowels of a String")
    void reverseVowelsOfAStringTestTC01(){
        setUp();
        String inpuString = "leetcode";
        assertEquals("leotcede",reverseVowelsOfAString.reverseVowels(inpuString),"Should be equals");
        inpuString="IceCreAm";
        assertEquals("AceCreIm",reverseVowelsOfAString.reverseVowels(inpuString),"Should be equals");
    }

    
}
