package com.excercise.coding.strings;

public class ReverseString {

    /*
     * TC: O(n)
     * SC: O(1)
     */
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char tmp;

        while(left < right)
        {
            tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

     public char[] reverseStringChar(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char tmp;

        while(left < right)
        {
            tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        return s;
    }
}
