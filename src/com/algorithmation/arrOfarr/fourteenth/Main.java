package com.algorithmation.arrOfarr.fourteenth;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of the strings of the matrix:");
        int strings = scanner.nextInt();
        System.out.println("Enter the number of the columns of the matrix:");
        int columns = scanner.nextInt();
        int[][] nums = new int[strings][columns];
        int k = 1;
        int t = 0;
        int b = 0;
        int count = 0;
        int count2 = 0;

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                if (i < j) {
//                   nums[i][j] = 1;
//                }
//            }
//        }

        for (int i = 1; i < columns; i++) {
            if (i == k) {
                do {
                    nums[random.nextInt(strings)][i] = 1;
                    t--;
                }
                while (t > 0);
            } t = i;
            t++;
            k++;
        }

        do {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (j == b) {
                        if (nums[i][j] == 1) {
                            count++;
                        }
                    }
                }
            }
            if (count < b) {
                do {
                    count2 = 0;
                    nums[random.nextInt(strings)][b] = 1;
                    for (int i = 0; i < nums.length; i++) {
                        for (int j = 0; j < nums[i].length; j++) {
                            if (j == b) {
                                if (nums[i][j] == 1) {
                                    count2++;
                                }
                            }
                        }
                    }
                } while (count2 < b && count2 != strings);
                System.out.println("k " + count2);
            }
            System.out.println(count);
            count = 0;
            b++;
        } while (b < columns);


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
