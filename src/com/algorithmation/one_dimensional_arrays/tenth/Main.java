package com.algorithmation.one_dimensional_arrays.tenth;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
