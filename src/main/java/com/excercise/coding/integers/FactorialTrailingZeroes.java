package com.excercise.coding.integers;

public class FactorialTrailingZeroes {
    /*
     * TC: O(log5 n),
     * SC:  O(1)
     */
    public int trailingZeroes(int n ){
        int count = 0;
        int powOfFive = 5;

        while(n>= powOfFive){
            count = count + (n/powOfFive);
            powOfFive*=5;
        }
        return count;
    }
}
