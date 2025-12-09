package com.excercise.coding.strings;

public class RemoveOutermostParantheses {

    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                depth++;
                if (depth > 1) {
                    result.append(c);
                }
            } else {
                depth--;
                if (depth >= 1) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

}
