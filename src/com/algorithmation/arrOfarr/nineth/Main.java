package com.algorithmation.arrOfarr.nineth;

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
        int k = 0;
        int sum = 0;
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = random.nextInt(10);
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        do {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (j == k) {
                        sum += nums[i][j];
                    }
                }
            }
            System.out.printf("The %d column has sum: %d\n", k, sum);
            if (max < sum) {
                max = sum;
                maxIndex = k;
            }
            sum = 0;
            k++;
        } while (k < columns);

        System.out.println("Max sum is: " + max);
        System.out.println("Column has max sum is: " + maxIndex);

    }
}
