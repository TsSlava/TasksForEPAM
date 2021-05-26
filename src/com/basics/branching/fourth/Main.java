package com.basics.branching.fourth;

import java.util.Scanner;

public class Main {

    public static void brickAndHole (int a, int b, int x, int y, int z) {
        if (((a >= x) && (b >= y)) || ((a >= x) && (b >= z)) || ((a >= z) && (b >= y))) {
            System.out.println("The brick appropriates");
        }
        else {
            System.out.println("The brick doesn't appropriate");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the variables:");
        brickAndHole(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
