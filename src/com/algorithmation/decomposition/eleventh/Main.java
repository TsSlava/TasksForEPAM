package com.algorithmation.decomposition.eleventh;

import java.util.Scanner;

public class Main {

    public static void programme(int n, int n2) {
        int k = -1;
        int mult = 1;
        int count;
        int mult2 = 1;
        int k2 = -1;
        do {
            count = n / mult % 10;
            mult *= 10;
            k++;
        } while (count != 0);

        do {
            count = n2 / mult2 % 10;
            mult2 *= 10;
            k2++;
        } while (count != 0);

        if (k > k2) {
            System.out.println("Цифр больше в первом числе");
        } else if (k < k2) {
            System.out.println("Цифр больше во втором числе");
        } else {
            System.out.println("Цифр поровну");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидете первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        programme(a, b);
    }
}
