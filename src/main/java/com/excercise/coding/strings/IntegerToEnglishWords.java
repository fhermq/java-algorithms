package com.excercise.coding.strings;

public class IntegerToEnglishWords {

    final String[] LESS_THAN_20 = {"Zero", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ",
        "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};

    final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        int i = 0;
        String stringNumber = "";

        if (num == 0) {
            return LESS_THAN_20[num];
        }

        while (num != 0) {
            if (num % 1000 != 0) {
                stringNumber = helper(num % 1000) + THOUSANDS[i] + " " + stringNumber;
            }
            num /= 1000;
            i++;
        }
        return stringNumber.trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return LESS_THAN_20[num];
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return LESS_THAN_20[num / 100] + "Hundred " + helper(num % 100);
        }
    }


}
