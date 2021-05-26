package com.algorithmation.arrOfarr.first;

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

        System.out.println("Нечётные столбцы (столбец), у которых первый элемень больше последнего:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (j % 2 == 0 && nums[0][j] > nums[nums.length - 1][j])
                    System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
