package com.basics.cycles.seventh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона:");
        int m = scanner.nextInt();
        System.out.println("Введите конец диапазона:");
        int n = scanner.nextInt();
        for (int i = m; i < n; i++) {
            System.out.print("Делители числа " + i + " = ");
            for (int q = 2; q < i; q++) {
                if (i % q == 0) {
                    System.out.print(" " + q + " ");
                }
            }
            System.out.println();
        }
    }
}
