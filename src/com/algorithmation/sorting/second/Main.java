package com.algorithmation.sorting.second;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = new int[]{3, 5, 6, 9};
        int[] nums2 = new int[]{2, 4, 6, 8, 9};
        int[] sum = new int[nums1.length + nums2.length];

        for (int i = 0; i < sum.length; i++) {
            if (i < nums1.length) {
                sum[i] = nums1[i];
            } else {
                sum[i] = nums2[i - nums1.length];
            }
        }

        for (int i = sum.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (sum[i] < sum[j])
                    sum[i] = sum[i] + sum[j] - (sum[j] = sum[i]);
            }

        }
        System.out.println(Arrays.toString(sum));

    }
}

