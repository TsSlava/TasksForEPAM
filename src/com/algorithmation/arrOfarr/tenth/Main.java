package com.algorithmation.arrOfarr.tenth;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size of the square matrix:");
        int size = scanner.nextInt();
        int[][] nums = new int[size][size];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = random.nextInt();
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Positive numbers of square matrix is: ");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] > 0 && i == j) {
                    System.out.print(nums[i][j] + " " );
                }
            }
        }

    }
}
