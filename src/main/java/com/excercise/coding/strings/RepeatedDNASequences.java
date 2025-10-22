package com.excercise.coding.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        HashSet<String> valueSet = new HashSet<>();
        int i = 0;

        while (i + 10 <= s.length()) {
            String subString = s.substring(i, i + 10);
            if (valueSet.contains(subString)) {
                if (!result.contains(subString)) {
                    result.add(subString);
                }
            } else {
                valueSet.add(subString);
            }
            i++;
        }
        return result;
    }

    public List<String> findRepeatedDnaSequencesFor(String s) {
        List<String> result = new ArrayList<>();
        HashSet<String> valueSet = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subString = s.substring(i, i + 10);
            if (valueSet.contains(subString)) {
                if (!result.contains(subString)) {
                    result.add(subString);
                }
            } else {
                valueSet.add(subString);
            }
        }
        return result;
    }
}
