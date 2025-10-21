package com.excercise.coding.integers;

public class IntegerToRoman {

    /*
     * TC: O(13*log n)
     * SC: O(13)
     */
    public String intToRoman(int num) {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valueSymbols = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < symbols.length; i++) {
            while (num >= valueSymbols[i]) {
                result.append(symbols[i]);
                num = num - valueSymbols[i];
            }
        }
        return result.toString();
    }
}
