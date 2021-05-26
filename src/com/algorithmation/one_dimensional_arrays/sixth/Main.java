package com.algorithmation.one_dimensional_arrays.sixth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = new double[]{5, 2.34, 6, 1.26, 8, 9, 5.78, 2, 2, 7.28};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 1 == 0) {
                sum += nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(sum);
    }

}
