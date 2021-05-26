package com.basics.cycles.first;

import java.util.Scanner;

public class Main {

    public static int cycle(int k) {
        int y = 0;
        for (int x = 1; x <= k; x++) {
            y += x;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        System.out.println(cycle(scanner.nextInt()));
    }
}
