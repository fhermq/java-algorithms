package com.excercise.coding;

public class PalindromeNumber {

    /*
     * TC: O(log n)
     * SC: O(1)
     */
    public boolean isPalindromeNumber(int number) {
        //Pre conditions
        if (number < 0) {
            return false;
        }
        if (number != 0 && number % 10 == 0) {
            return false;
        }
        int reverseNumber = 0;
        while (number > reverseNumber) {
            int lastDigit = number % 10; //Get last Digit of number
            reverseNumber = reverseNumber * 10 + lastDigit; //Place in the first digit.
            number = number / 10;  // Remove last digit
        }
        return (number == reverseNumber || number == reverseNumber / 10);
    }
}
