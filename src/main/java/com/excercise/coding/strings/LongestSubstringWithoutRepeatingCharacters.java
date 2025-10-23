package com.excercise.coding.strings;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * 3. Longest Substring Without Repeating Characters - Leetcode
     * Hint: Sliding window technique
     * TC: O(n)
     * SC: O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int length = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (!map.containsKey(c)) {
                map.put(c, right);
            } else {
                if (right - left == length) {
                    System.out.println(s.substring(left, right));
                }
                left = Math.max(left, map.get(c) + 1);
                map.put(c, right);
            }

            length = Math.max(length, right - left + 1);

        }
        // System.out.println(Arrays.toString(list.toArray()));
        return length;
    }
}
