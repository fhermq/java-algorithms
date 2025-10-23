package com.excercise.coding.strings;

public class LongestPalindromicSubstring {

    private int start = 0;
    private int end = 0;

    /**
     * TC: O(n^2), where 'n' is the length of the string. This is because there
     * are 'n' potential centers, and for each center, expanding outwards can
     * take up to O(n) time in the worst case. SC O(1), as only a few variables
     * are used to store indices and lengths.
     */
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i); // for odd-length
            expandAroundCenter(s, i, i + 1);    // for even-length 
        }
        return s.substring(start, end + 1);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        //Correct values
        left = left + 1;
        right = right - 1;

        if (end - start + 1 < right - left + 1) {
            start = left;
            end = right;
        }
    }
}
