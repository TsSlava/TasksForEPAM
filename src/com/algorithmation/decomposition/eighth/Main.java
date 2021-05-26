package com.algorithmation.decomposition.eighth;

import java.util.Arrays;

public class Main {

    public static int sumABC (int[] nums) {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum += nums[i];
        } return sum;
    }

    public static int sumCDE (int[] nums) {
        int sum = 0;
        for (int i = 3; i <= 5; i++) {
            sum += nums[i];
        } return sum;
    }

    public static int sumDEF (int[] nums) {
        int sum = 0;
        for (int i = 4; i <= 6; i++) {
            sum += nums[i];
        } return sum;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 9, 1, 2, 2};
        System.out.println("Дан массив D: " + Arrays.toString(nums));
        System.out.println("Элемент D[0] = " + nums[0]);
        System.out.println("Сумма элементов D[1] + D[2] + D[3] = " + sumABC(nums));
        System.out.println("Сумма элементов D[3] + D[4] + D[5] = " + sumCDE(nums));
        System.out.println("Сумма элементов D[4] + D[5] + D[6] = " + sumDEF(nums));
    }
}
