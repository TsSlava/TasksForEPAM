package com.algorithmation.arrOfarr.eighth;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of the lines of the matrix:");
        int lines = scanner.nextInt();
        System.out.println("Enter the number of the columns of the matrix:");
        int columns = scanner.nextInt();
        int[][] nums = new int[lines][columns];
        System.out.println("Enter the number of the column that will be changed:");
        int changed = scanner.nextInt();
        System.out.println("Enter the second number of the column that will be changed:");
        int changed2 = scanner.nextInt();
        int[][] nums2 = new int[lines][columns];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = random.nextInt(10);
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums2[i][changed] = nums[i][changed];
                nums2[i][changed2] = nums[i][changed2];
            }
        }


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][changed2] = nums2[i][changed];
                nums[i][changed] = nums2[i][changed2];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
