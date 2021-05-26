package com.algorithmation.arrOfarr.twelfth;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        boolean sorted = false;
        int temp;
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

        for (int i = 0; i < nums.length; i++) {
            while (!sorted) {
                sorted = true;
                for (int j = 0; j < nums[i].length - 1; j++) {
                    if (nums[i][j] > nums[i][j + 1]) {
                        temp = nums[i][j];
                        nums[i][j] = nums[i][j + 1];
                        nums[i][j + 1] = temp;
                        sorted = false;
                    }
                }
            }
            sorted = false;
        }

        System.out.println();
        System.out.println("Ascending:");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            while (!sorted) {
                sorted = true;
                for (int j = 0; j < nums[i].length - 1; j++) {
                    if (nums[i][j] < nums[i][j + 1]) {
                        temp = nums[i][j];
                        nums[i][j] = nums[i][j + 1];
                        nums[i][j + 1] = temp;
                        sorted = false;
                    }
                }
            }
            sorted = false;
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
