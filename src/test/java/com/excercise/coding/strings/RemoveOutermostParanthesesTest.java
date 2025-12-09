package com.excercise.coding.strings;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Remove Outhermost Parentheses")
public class RemoveOutermostParanthesesTest {

    RemoveOutermostParantheses removeOutermostParantheses;
    String[] input = {"(()())(())","(()())(())(()(()))","()()"};
    String[] resultExpected= {"()()()","()()()()(())",""};

    @BeforeEach()
    void setUp(){
        removeOutermostParantheses = new RemoveOutermostParantheses();
    }

    @Test
    @DisplayName("Should be Equals")
    void testRemoveOutermostParantheses(){
        setUp();
        String[] output = new String[input.length];
        for(int i=0; i< output.length; i++){
            output[i]= removeOutermostParantheses.removeOuterParentheses(input[i]);
        } 
        assertArrayEquals(resultExpected, output);
    }
}
