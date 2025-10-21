package com.excercise.coding.integers;

public class ReverseInteger {

    /*
     * TC: O(log10 x)
     * SC: O(1)
     */
    public int reverse(int x) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10; //last digit
            if (reverse < minValue / 10 || reverse > maxValue / 10) { //Prevent overflow
                return 0; 
            }
            reverse = reverse * 10 + digit; //Apend last digit
            x = x / 10; //remove last Digit
        }
        return reverse;
    }
}
