package com.algorithmation.one_dimensional_arrays.fifth;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(20) - 10;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > i) {
                System.out.print(nums[i] + " ");
            }
        }

    }
}
