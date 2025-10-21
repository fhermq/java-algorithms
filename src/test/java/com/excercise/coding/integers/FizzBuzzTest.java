package com.excercise.coding.integers;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Fizz Buzz Algorith")
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    String[] expected1 = {"1"};
    String[] expected5 = {"1", "2", "Fizz", "4", "Buzz"};
    String[] expected15 = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

    @BeforeEach
    void setUp() {
        // Initialize the object under test before each test method
        fizzBuzz = new FizzBuzz();
    }


    /*
     * Test for getFizzBuzzArray
     */
    @Test
    @DisplayName("getFizzBuzzArray - Should correctly get FizzBuzz Array for 1")
    void testgetFizzBuzzArrayWithOne() {
        setUp();
        String[] actual = fizzBuzz.getFizzBuzzArray(1);
        assertArrayEquals(expected1, actual, "Error");
    }

    @Test
    @DisplayName("getFizzBuzzArray - Should correctly get FizzBuzz Array for 5")
    void testgetFizzBuzzArrayWithFive() {
        String[] actual = fizzBuzz.getFizzBuzzArray(5);
        assertArrayEquals(expected5, actual, "Error");
    }

    @Test
    @DisplayName("getFizzBuzzArray - Should correctly get FizzBuzz Array for 15")
    void testgetFizzBuzzArrayWithFifteen() {
        String[] actual = fizzBuzz.getFizzBuzzArray(15);
        assertArrayEquals(expected15, actual, "Error");
    }


    /*
     * Test for getFizzBuzzList
     */
    @Test
    @DisplayName("getFizzBuzzList - Should correctly get FizzBuzz Array for 1")
    void testgetFizzBuzzListWithOne() {
        List<String> expected = Arrays.asList(expected1);
        List<String> actual = fizzBuzz.getFizzBuzzList(1);
        assertArrayEquals(expected.toArray(), actual.toArray(), "Error");
    }

    @Test
    @DisplayName("getFizzBuzzList - Should correctly get FizzBuzz Array for 5")
    void testgetFizzBuzzListWithFive() {
        List<String> expected = Arrays.asList(expected5);
        List<String> actual = fizzBuzz.getFizzBuzzList(5);
        assertArrayEquals(expected.toArray(), actual.toArray(), "Error");
    }

    @Test
    @DisplayName("getFizzBuzzList - Should correctly get FizzBuzz Array for 15")
    void testgetFizzBuzzListFifteen() {
        List<String> expected = Arrays.asList(expected15);
        List<String> actual = fizzBuzz.getFizzBuzzList(15);
        assertArrayEquals(expected.toArray(), actual.toArray(), "Error");
    }

    /*
     * Test for getFizzBuzzListOp2
     */
    @Test
    @DisplayName("getFizzBuzzListOp2 - Should correctly get FizzBuzz Array for 1")
    void testgetFizzBuzzListOp2WithOne() {
        List<String> expected = Arrays.asList(expected1);
        List<String> actual = fizzBuzz.getFizzBuzzListOp2(1);
        assertArrayEquals(expected.toArray(), actual.toArray(), "Error");
    }

    @Test
    @DisplayName("getFizzBuzzListOp2 - Should correctly get FizzBuzz Array for 5")
    void testgetFizzBuzzListOp2WithFive() {
        List<String> expected = Arrays.asList(expected5);
        List<String> actual = fizzBuzz.getFizzBuzzListOp2(5);
        assertArrayEquals(expected.toArray(), actual.toArray(), "Error");
    }

    @Test
    @DisplayName("getFizzBuzzListOp2 - Should correctly get FizzBuzz Array for 15")
    void testgetFizzBuzzListOp2Fifteen() {
        List<String> expected = Arrays.asList(expected15);
        List<String> actual = fizzBuzz.getFizzBuzzListOp2(15);
        assertArrayEquals(expected.toArray(), actual.toArray(), "Error");
    }

}
