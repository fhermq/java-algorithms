package com.excercise.coding.integers;

public class PowXNBinaryExponentiation {

    /*
     * TC: O(log2 n)
     * SC: O(1)
     */
    public double myPow(double x, int n) {
        double number = Math.abs((long) n);
        double result = 1.0;
        double current_base = x;

        while (number != 0) {
            if (number % 2 == 1) { //Odd Pow
                result = result * current_base;
                number = number - 1;
            }
            // Even Pow
            current_base = current_base * current_base;
            number = number / 2;
        }
        return n < 0 ? (1.0 / result) : result;
    }


}
