package com.excercise.coding;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        System.out.println("Single number: " + getSingleNumber(array));
        System.out.println("Single number with SET: " + getSingleNumberWithSet(array));
    }

    /*
     * TC: 0(n)
     * SC: 0(1)
     */
    public static int getSingleNumber(int array[]) {
        int singleNumber = 0;
        for (int num : array) {
            singleNumber ^= num;
        }
        return singleNumber;
    }


    /*
     * TC: 0(n)
     * SC: 0(n)
     */
    public static int getSingleNumberWithSet(int array[]) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}
