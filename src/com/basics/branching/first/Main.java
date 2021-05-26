package com.basics.branching.first;

import java.util.Scanner;

public class Main {

    public static void angles(int a, int b) {
        if ((180 - a - b) > 0 && (180 - a - b) != 90) {
            System.out.println("The triangle exists");
        }
        else if ((180 - a - b) == 90) {
            System.out.println("The triangle is rectangular");
        }
        else {
            System.out.println("The triangle doesn't exist");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two angles");
        angles(scanner.nextInt(), scanner.nextInt());
    }
}
