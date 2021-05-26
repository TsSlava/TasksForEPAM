package com.algorithmation.arrOfarr.fourth;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of square matrix:");
        int size = scanner.nextInt();
        int[][] nums = new int[size][size];
        int k = 1;
        int k2 = size;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < nums[0].length; j++) {
                    nums[i][j] = k;
                    System.out.print(" " + nums[i][j] + " ");
                    k++;
                }
                k = 1;
            } else {
                for (int j = 0; j < nums[0].length; j++) {
                    nums[i][j] = k2;
                    System.out.print(" " + nums[i][j] + " ");
                    k2--;
                }
                k2 = size;
            }
            System.out.println();
        }
    }
}
