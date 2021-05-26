package com.algorithmation.arrOfarr.second;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] nums = new int[4][4];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Элементы на диагонили:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (i == j) {
                    System.out.print(" " + nums[i][j] + " ");
                }
            }
        }
    }
}
