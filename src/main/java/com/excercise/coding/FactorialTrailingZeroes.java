package com.excercise.coding;

public class FactorialTrailingZeroes {
    /*
     * TC: 0(log5 n),
     * SC:  0(1)
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
