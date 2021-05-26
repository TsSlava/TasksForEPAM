package com.algorithmation.one_dimensional_arrays.fourth;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        int max = 0;
        int min = 0;
        int maxArr = nums[0];
        int minArr = nums[0];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(60) - 30;
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxArr = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minArr = i;
            }
        }

        nums[maxArr] = min;
        nums[minArr] = max;
        System.out.println(max);
        System.out.println(min);
        System.out.println(Arrays.toString(nums));
    }
}
