package com.algorithmation.one_dimensional_arrays.eighth;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        int minValue = 0;
        int countMin = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(20) -10;
        }

        System.out.println(Arrays.toString(nums));

        for (int num: nums) {
            minValue = Math.min(minValue, num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minValue) {
                countMin++;
            }
        }

        System.out.println(minValue);
        System.out.println(countMin);

        int[] nums2 = new int[length - countMin];
        int i = 0;
        for (int num: nums) {
            if (num != minValue) {
                nums2[i++] = num;
            }
        }

        System.out.println(Arrays.toString(nums2));
    }
}
