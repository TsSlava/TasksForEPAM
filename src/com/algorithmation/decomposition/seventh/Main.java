package com.algorithmation.decomposition.seventh;


public class Main {

    public static int factorial() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumF = 0;
        for (int i = 0; i < nums.length; i++) {
            int f = 1;
            if (nums[i] % 2 != 0) {
                for (int j = 1; j <= nums[i]; j++) {
                    f *= j;
                }
                sumF += f;
            }
        }
        return sumF;
    }

    public static void main(String[] args) {
        System.out.println("Сумма факториала всех нечётных чисел массива от 1 до 9 равна " + factorial());
    }
}
