package com.algorithmation.arrOfarr.third;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[4][4];
        System.out.println("Enter the number of the line from 0 to 3:");
        int k = scanner.nextInt();
        System.out.println("Enter the number of the column from 0 to 3:");
        int p = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Two-dimensional array is:");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.printf("The %dth line:", k);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (i == k) {
                    System.out.print(" " + nums[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.printf("The %dth column:\n", p);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (j == p) {
                    System.out.print(" " + nums[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.printf("The element of %dth line and %dth column is:", k, p);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (j == p && i == k) {
                    System.out.print(" " + nums[i][j] + " ");
                }
            }
        }
    }
}
