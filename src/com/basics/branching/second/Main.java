package com.basics.branching.second;

import java.util.Scanner;

public class Main {

    public static int maxBranching(int a, int b, int c, int d) {
        int min1;
        int min2;
        int max;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        System.out.println(maxBranching(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}
