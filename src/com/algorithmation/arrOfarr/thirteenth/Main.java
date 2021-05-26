package com.algorithmation.arrOfarr.thirteenth;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean sorted = false;
        int temp;
        int k = 0;
        int[][] nums = new int[5][6];


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] > nums[i + 1][j]) {
                        temp = nums[i][j];
                        nums[i][j] = nums[i + 1][j];
                        nums[i + 1][j] = temp;
                        sorted = false;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Ascending:");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] < nums[i + 1][j]) {
                        temp = nums[i][j];
                        nums[i][j] = nums[i + 1][j];
                        nums[i + 1][j] = temp;
                        sorted = false;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Descending:");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
