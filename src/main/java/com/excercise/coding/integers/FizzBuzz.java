package com.excercise.coding.integers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    /*
    * Best Solution
     *TC: O(n)
     *SC: O(1)  
     */
    public List<String> getFizzBuzzList(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }
        return fizzBuzzList;
    }

    public String[] getFizzBuzzArray(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            String value = "";
            if (i % 3 == 0) {
                value += "Fizz";
            }
            if (i % 5 == 0) {
                value += "Buzz";
            }
            if (value.isEmpty()) {
                value += i + "";
            }
            result[i - 1] = value;
        }
        return result;
    }

    public List<String> getFizzBuzzListOp2(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String value = "";
            if (i % 3 == 0) {
                value += "Fizz";
            }
            if (i % 5 == 0) {
                value += "Buzz";
            }
            if (value.isEmpty()) {
                value += String.valueOf(i);
            }
            fizzBuzzList.add(value);
        }
        return fizzBuzzList;
    }

}
