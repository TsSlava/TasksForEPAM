package com.algorithmation.arrOfarr.fifth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int size = scanner.nextInt();
        int[][] nums = new int[size][size];
//        int k = 0;

//        for(int i = 0; i < nums.length; i++){
//            for(int j = 0; j < nums[0].length; j++){
//                if(j == nums.length - k){
//                    for(; j < nums.length; j++){
//                        nums[i][j] = 0;
//                    }
//                } else
//                    nums[i][j] = i + 1;
//            }
//            k++;
//        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length - i; j++) {
                nums[i][j] = i + 1;
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
