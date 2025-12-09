package com.excercise.coding.binarysearch;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            int num = nums[middle];
            if (num == target) {
                return middle;
            }
            if (target < num) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
