package com.excercise.coding.strings;

public class ReverseWordsInAString {

    /*
     * 
     * Best solution.
     * TC: O(n)
     * SC: O(1)
     * 
     */
    public String reverseWords(String s) {
        /**
         * Strategy 1. Reverse the entire String 2. Reverse each Word; 3. Clean
         * space.
         */

        //1. Reverse the Entire String
        char[] sArray = s.toCharArray();
        reverseArray(sArray, 0, s.length() - 1);

        //2. Reverse each word.
        reverseWords(sArray);

        //3. Clean Spaces
        return cleanSpaces(sArray);

    }

    /*
     * Using 
     */
    private void reverseWords(char[] s) {
        int left = 0;
        int right = 0;
        while (left < s.length) {
            while (left < s.length && s[left] == ' ') { //Move until find a word character
                left++;
            }
            right = left;//Move right to the left
            while (right < s.length && s[right] != ' ') { //Move to get the end position of the wor.
                right++;
            }
            reverseArray(s, left, right - 1);  //Reverse the word in the array
            left = right; //Move to the right to continue.
        }
    }

    private String cleanSpaces(char[] s) {
        int left = 0;
        int rigth = 0;
        while (rigth < s.length) { // Move from left to right
            while (rigth < s.length && s[rigth] == ' ') {  //Move to the right until find a word.
                rigth++;
            }

            while (rigth < s.length && s[rigth] != ' ') { //When find a word, Iterate until finidh
                char tmp = s[left];
                s[left] = s[rigth];
                s[rigth] = tmp;
                left++;
                rigth++;
            }

            while (rigth < s.length && s[rigth] == ' ') { // Move forward untile find the next word.
                rigth++;

            }
            if (rigth < s.length) { // before star other cycle, leve a white space;
                s[left] = ' ';
                left++;
            }
        }

        return new String(s).substring(0, left);
    }

    private void reverseArray(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[right];
            s[right] = s[left];
            s[left] = tmp;
            right--;
            left++;
        }
        // System.out.println("r: " + Arrays.toString(s));
    }

    /**
     * An alternative solution
     *
     */
    private String reverseWordsWithStringbuilder(String s) {
        //Split the String using the space.
        //Convert to arrary.
        String inputArray[] = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = inputArray.length - 1; i >= 0; i--) {
            //If there is an String space remove.
            if (!inputArray[i].equals("")) {
                stringBuilder.append(inputArray[i]);
                stringBuilder.append(" ");
            }
        }
        //Split to remove space at the end.
        return stringBuilder.toString().trim();
    }

    /**
     * Not the best appoach.
     *
     */
    private String reverseWordsWithString(String s) {
        int start = 0;
        String res = "";
        s = s.trim();
        for (int end = 0; end < s.length(); end++) {
            String word = "";
            Character c = s.charAt(end);
            if (c == ' ' || end == s.length() - 1) {
                if (end - start >= 0) {
                    if (end == s.length() - 1) {
                        word = s.substring(start, end + 1);
                    } else {
                        word = s.substring(start, end);
                    }
                    if (word != "") {
                        res = " " + word + res;
                    }
                }
                start = end + 1;
            }
        }
        return res.trim();
    }

}
