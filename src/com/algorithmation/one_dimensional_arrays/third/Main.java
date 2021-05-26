package com.algorithmation.one_dimensional_arrays.third;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int length = scanner.nextInt();
        int countBelow = 0;
        int countAbove = 0;
        int countZero = 0;

        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                countBelow++;
            }
            if (nums[i] > 0) {
                countAbove++;
            }
            if (nums[i] == 0) {
                countZero++;
            }
        }

        System.out.println("Quantity of positive elements: " + countAbove);
        System.out.println("Quantity of negative elements: " + countBelow);
        System.out.println("Quantity of zero elements: " + countZero);
    }
}
