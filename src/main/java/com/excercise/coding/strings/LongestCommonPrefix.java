package com.excercise.coding.strings;

public class LongestCommonPrefix {

    /*
     * TC: O(m*n)
     * SC: O(1)
     */
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0 && !prefix.isEmpty()) {//is not finded && prefix is not empty
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
