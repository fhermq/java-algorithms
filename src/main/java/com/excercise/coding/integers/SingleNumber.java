package com.excercise.coding.integers;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    /*
     * TC: O(n)
     * SC: O(1)
     */
    public int getSingleNumber(int numbers[]) {
        int singleNumber = 0;
        for (int number : numbers) {
            singleNumber ^= number;
        }
        return singleNumber;
    }


    /*
     * TC: 0(n)
     * SC: 0(n)
     */
    public int getSingleNumberWithSet(int numbers[]) {
        if(numbers.length==1) return 0;
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            if (set.contains(number)) {
                set.remove(number);
            } else {
                set.add(number);
            }
        }
        return set.iterator().next();
    }
}
