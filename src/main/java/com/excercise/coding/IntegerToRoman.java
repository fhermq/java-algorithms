package com.excercise.coding;

public class IntegerToRoman {

    /*
     * TC: 0(13*log n)
     * SC: 0(13)
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
        System.out.println(result.toString());
        return result.toString();
    }
}
