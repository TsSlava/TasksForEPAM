package com.algorithmation.one_dimensional_arrays.first;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 10:");
        int num = sc.nextInt();
        int[] nums = new int[10];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % num == 0) {
                sum += nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Sum is " + sum);
    }
}
