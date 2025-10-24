package com.excercise.coding.strings;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("")
public class ReverseWordsInAStringTest {

    ReverseWordsInAString reverseWordsInAString;
    String[] input = {"the sky is blue",  "hello world  ", "a good   example", " asdasd df f"};
    String[] expected = {"blue is sky the","world hello","example good a","f df asdasd"};


    @BeforeEach
    void setUp() {
        reverseWordsInAString = new ReverseWordsInAString();
    }

    @Test
    @DisplayName("Should perform reverse the words of strings")
    void testReverseWordsInAString() {
        String actual[] = new String[input.length];
        for (int i = 0;  i < input.length  ; i++) {  
            actual[i] = reverseWordsInAString.reverseWords(input[i]);
        }
        assertArrayEquals(expected,actual,"Should be equals");

    }

}
