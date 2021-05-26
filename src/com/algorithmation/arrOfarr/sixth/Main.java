package com.algorithmation.arrOfarr.sixth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int size = scanner.nextInt();
        int[][] nums = new int[size][size];

        for (int i = 0; i < nums.length; i++) {
                for (int j = 0 + i; j < nums[0].length - i; j++) {
                    nums[i][j] = 1;
                }
            }

        for (int i = size / 2; i < nums.length; i++) {
            for (int j = size - 1 - i; j <= i; j++) {
                nums[i][j] = 1;
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
