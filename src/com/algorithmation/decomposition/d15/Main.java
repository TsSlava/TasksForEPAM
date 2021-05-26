package com.algorithmation.decomposition.d15;

import java.util.Scanner;

public class Main {

    public static int startRange(int n) {
        return (int) Math.pow(10, n) / 10;
    }

    public static int maxRange(int n) {
        return (int) Math.pow(10, n) - 1;
    }

    public static void programme(int k) {
        int num;
        int num2 = 0;
        int mult;
        int mult2;
        int check;
        for (int i = startRange(k); i < maxRange(k); i++) {
            check = 0;
            mult = (int) Math.pow(10, k) / 10;
            mult2 = (int) Math.pow(10, k) / 100;
            for (int j = 0; j < k; j++) {
                num = i / mult % 10;
                mult /= 10;
                if (mult > 0) {
                    num2 = i / mult2 % 10;
                    mult2 /= 10;
                }
                if (num < num2 && ((num + 1) == num2)) {
                    check++;
                }
            }
            if (k == (check + 1)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Введите количество цифр в числе:");
        num = scanner.nextInt();
        System.out.printf("Натуральные %d-е числа, которые образуют строго возрастающую последовательность:\n", num);
        programme(num);
    }
}
