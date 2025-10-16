package com.excercise.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        List<String> fizzBuList;
        String result[];
        fizzBuList = getFizzBuzzList(n);
        System.out.println(fizzBuList.toString());
        fizzBuList = getFizzBuzzListTwo(n);
        System.out.println(fizzBuList.toString());
        result = fizzBuzzWithArray(n);
        System.out.println(Arrays.toString(result));

        //TC: 0(n)
        //SC: 0(1)
    }

    public static List<String> getFizzBuzzList(int n) {
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


    /*
     *TC: 0(n)
     *SC: 0(1)  
     */
    public static List<String> getFizzBuzzListTwo(int n) {
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

    public static String[] fizzBuzzWithArray(int n) {
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

}
