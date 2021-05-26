package com.algorithmation.one_dimensional_arrays.second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 200:");
        int num = scanner.nextInt();
        int[] nums = new int[10];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(201) - 100;
        }

        System.out.println("Before: " + Arrays.toString(nums));

        if (num >= 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > num) {
                    nums[i] = num;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] < 0) {
                            nums[j] = num;
                            k++;
                        }
                    }
                    k++;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > num) {
                    nums[i] = num;
                    k++;
                }

            }
        }
        System.out.println("After: " + Arrays.toString(nums));
        System.out.println("Numbers of replacements: " + k);

    }

}
