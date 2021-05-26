package com.algorithmation.arrOfarr.fifteenth;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the strings of the matrix:");
        int strings = scanner.nextInt();
        System.out.println("Enter the number of the columns of the matrix:");
        int columns = scanner.nextInt();
        int[][] nums = new int[strings][columns];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(1000);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (max < nums[i][j]) {
                    max = nums[i][j];
                }
            }
        }

        System.out.println("Max is: " + max);


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 != 0) {
                    nums[i][j] = max;
                }
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
