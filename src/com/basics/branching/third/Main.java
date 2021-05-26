package com.basics.branching.third;

import java.util.Scanner;

public class Main {

//    public static boolean pointOnLine(int x1, int y1, int x2, int y2, int x3, int y3) {
//        return (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1);
//    }

    public static void pointOnLine (int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1)) {
            System.out.println("The points lie on the line");
        } else {
            System.out.println("The points don't lie on the line");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter six points:");
        pointOnLine(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
//        System.out.println(pointOnLine(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}
