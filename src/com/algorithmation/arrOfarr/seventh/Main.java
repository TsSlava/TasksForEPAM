package com.algorithmation.arrOfarr.seventh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int size = scanner.nextInt();
        double[][] nums = new double[size][size];
        int k  = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                nums[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / size );
                if (nums[i][j] > 0) {
                    k++;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantity  of positive numbers: " + k);
    }
}
