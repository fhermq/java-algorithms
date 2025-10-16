package com.excercise.coding;

public class SingleNumber {

    public static void main(String[] args) {
      int[] array = {4, 1, 2, 1, 2};
        System.out.println("Single number: " + getSingleNumber(array));   
    }

    public static int getSingleNumber(int array[]) {
        int singleNumber = 0;
        for (int num : array) {
            singleNumber ^= num;
        }
        return singleNumber;
    }

}
