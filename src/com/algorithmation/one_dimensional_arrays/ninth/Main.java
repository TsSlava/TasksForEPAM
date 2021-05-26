package com.algorithmation.one_dimensional_arrays.ninth;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        int[] k = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    k[i]++;
            }
        }

        System.out.println(Arrays.toString(k));

        int num = nums[0];
        int num2 = k[0];
        for (int i = 0; i < k.length; i++) {
            if (k[i] > num2) {
                num2 = k[i];
                num = nums[i];
            }
            if ((num2 == k[i]) && (nums[i] < num)) {
                num = nums[i];
            }
        }
        System.out.println(num);
    }
}
