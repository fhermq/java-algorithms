package com.excercise.coding.integers;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Single Number Algorith")
public class SingleNumberTest {

    private SingleNumber singleNumber;
    int[] array = {4, 1, 2, 1, 2};

    @BeforeEach
    void setUp(){
        singleNumber = new SingleNumber();
    }

    @Test
    @DisplayName("getSingleNumber - Should return the single number that is not repeated")
    void testGetSingleNumber() {
        setUp();
        int actual = singleNumber.getSingleNumber(array);
        assertEquals(4, actual);
    }

    @Test
    @DisplayName("getSingleNumberWithSet - Should return the single number that is not repeated")
    void testGetSingleNumberWithSet() {
        int actual = singleNumber.getSingleNumberWithSet(array);
        assertEquals(4, actual);
    }

}
