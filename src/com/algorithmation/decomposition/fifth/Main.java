package com.algorithmation.decomposition.fifth;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int secondNumber(int[] nums) {
        int secondMax = 0;
        boolean isSorted = false;
        int index;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    isSorted = false;

                    index = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = index;
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                secondMax = nums[i + 1];
                break;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Дан следующий массив: " + Arrays.toString(arr));
        if (secondNumber(arr) != 0) {
            System.out.println("Второе самое большое число: " + secondNumber(arr));
        } else {
            System.out.println("Все числа равны");
        }
    }
}
