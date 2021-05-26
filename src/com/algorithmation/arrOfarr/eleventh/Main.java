package com.algorithmation.arrOfarr.eleventh;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] nums = new int[10][20];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = random.nextInt(16);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Numbers of the lines where 5 meets three and more times is: ");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 5) {
                    k++;
                }
            }
            if (k >= 3) {
                System.out.print( i + " ");
            }
            k = 0;
        }
    }
}
