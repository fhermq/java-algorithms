package com.excercise.coding.strings;

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;
        char[] sArray = s.toCharArray();

        int leftVowel = -1;
        int rightVowel = -1;

        while (left < right) {
            if (vowels.contains(String.valueOf(sArray[left]))) {
                leftVowel = left;
            } else {
                left++;
            }
            if (vowels.contains(String.valueOf(sArray[right]))) {
                rightVowel = right;
            } else {
                right--;
            }
            if (leftVowel != -1 && rightVowel != -1) {
                char tmp = sArray[left];
                sArray[leftVowel] = sArray[rightVowel];
                sArray[rightVowel] = tmp;
                left++;
                right--;
                leftVowel = -1;
                rightVowel = -1;
            }
        }
        return String.valueOf(sArray);
    }
}
