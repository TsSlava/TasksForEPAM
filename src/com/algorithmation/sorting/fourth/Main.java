package com.algorithmation.sorting.fourth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {5, 8, 21, 3, 1, 7};

        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = tmp;
                    isSorted = true;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
