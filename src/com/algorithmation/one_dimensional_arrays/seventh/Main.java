package com.algorithmation.one_dimensional_arrays.seventh;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double[] nums = new double[20];
        double max = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (random.nextInt(200) -100) + random.nextDouble();
        }

        max = nums[0] + nums[nums.length - 1];
        for (int i = 1; i < nums.length/2; i++) {
            if ((nums[i] + nums[nums.length - i - 1]) > max) {
                max = nums[i] + nums[nums.length - i - 1];
            }
        }

        System.out.println(max);
        System.out.println(Arrays.toString(nums));
    }
}
