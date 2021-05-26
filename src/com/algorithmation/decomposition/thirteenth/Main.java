package com.algorithmation.decomposition.thirteenth;

import java.util.Scanner;

public class Main {

    public static void twins(int n) {
        for (int i = n; i < 2 * n - 2; i++) {
            if (simpleNum(i) && simpleNum(i + 2)) {
                System.out.println(i + " и " + (i + 2));
            }

        }
    }

    public static boolean simpleNum(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Введите число начало отрезка:");
        n = scanner.nextInt();
        System.out.printf("Отрезок от %d до %d\nПары близнецов:\n", n, n * 2);
        twins(n);
    }
}
