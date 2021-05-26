package com.algorithmation.sorting.sixth;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200) -100;
        }

        System.out.println(Arrays.toString(nums));

        for (int step = nums.length / 2; step > 0; step /= 2) {
            for (int i = step; i < nums.length; i++) {
                for (int j = i - step; j >= 0 && nums[j] > nums[j + step] ; j -= step) {
                    int x = nums[j];
                    nums[j] = nums[j + step];
                    nums[j + step] = x;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
