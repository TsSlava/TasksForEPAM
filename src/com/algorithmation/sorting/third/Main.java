package com.algorithmation.sorting.third;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 12, 17};

        for (int min = 0; min < nums.length; min++) {
            int max = min;
            for (int i = min; i < nums.length; i++) {
                if (nums[i] > nums[max]) {
                    max = i;
                }
            }
            int tmp = nums[min];
            nums[min] = nums[max];
            nums[max] = tmp;
        }

        System.out.println(Arrays.toString(nums));

    }
}
