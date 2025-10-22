package com.excercise.coding.strings;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Repeated DNA Sequences Test")
public class RepeatedDNASequencesTest {

    RepeatedDNASequences repeatedDNASequences;
    String input1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    String[] expected1 = {"AAAAACCCCC", "CCCCCAAAAA"};
    String input2 = "AAAAAAAAAAAAA";
    String[] expected2 = {"AAAAAAAAAA"};
    String input3 = "AAAAAAAAAAA";
    String[] expected3 = {"AAAAAAAAAA"};

    @BeforeEach
    void setUp() {
        repeatedDNASequences = new RepeatedDNASequences();
    }

    @Test
    @DisplayName("Should perform function an return 2 items")
    void testRepeatedDNASequencesTC01() {
        setUp();
        List<String> actual = repeatedDNASequences.findRepeatedDnaSequences(input1);
        Assertions.assertEquals(Arrays.asList(expected1), actual);
    }

    @Test
    @DisplayName("Should perform function an return 1 item")
    void testRepeatedDNASequencesTC02() {
        setUp();
        List<String> actual = repeatedDNASequences.findRepeatedDnaSequences(input2);
        Assertions.assertEquals(Arrays.asList(expected2), actual);
    }

    @Test
    @DisplayName("Should perform function an return 1 item")
    void testRepeatedDNASequencesTC03() {
        setUp();
        List<String> actual = repeatedDNASequences.findRepeatedDnaSequences(input3);
        Assertions.assertEquals(Arrays.asList(expected3), actual);
    }

    @Test
    @DisplayName("Should perform function with FOR an return 1 item")
    void testRepeatedDNASequencesTC04() {
        setUp();
        List<String> actual = repeatedDNASequences.findRepeatedDnaSequencesFor(input3);
        Assertions.assertEquals(Arrays.asList(expected3), actual);
    }

}
