package com.algorithmation.sorting.first;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int k = 4;
        int count = 0;
        int[] nums = new int[]{5, 3, 9, 4, 5};
        int[] nums2 = new int[]{2, 3, 3};
        int[] sum = new int[nums.length + nums2.length];

        for (int i = 0; i < sum.length; i++) {
            if (k > i) {
                sum[i] = nums[i];
                ;
            } else if (k <= i && count < nums2.length) {
                sum[i] = nums2[count];
                count++;
            } else {
                sum[i] = nums[i - nums2.length];
            }
        }

        System.out.println(Arrays.toString(sum));
    }
}

