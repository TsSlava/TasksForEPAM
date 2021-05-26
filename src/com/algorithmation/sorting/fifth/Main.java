package com.algorithmation.sorting.fifth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 21, 13, 7, 10, 11, 13, 1};
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (num < nums[j]) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = num;
        }
        System.out.println(Arrays.toString(nums));
    }
}
