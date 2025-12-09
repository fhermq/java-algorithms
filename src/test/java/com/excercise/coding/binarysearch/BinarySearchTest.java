package com.excercise.coding.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Find the target number, return index if exist or -1 if not exist")
public class BinarySearchTest {

    BinarySearch binarySearch;

    int[] input = {-1, 0, 3, 5, 9, 12};
    int[] target = {9, 2, 13}; //Expected 
    int[] expected = {4, -1, -1};

    @BeforeEach()
    void setUp(){
        binarySearch = new BinarySearch();
    }

    @Test
   @DisplayName("Should return the index or -1") 
    void testBinarySearch(){
        setUp();
        for(int i=0;i<target.length; i++ ){
            int output = binarySearch.search(input, target[i]);
            assertEquals(output, expected[i]);
        }
    }

}
