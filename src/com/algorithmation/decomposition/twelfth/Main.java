package com.algorithmation.decomposition.twelfth;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] programme(int k, int n) {
        Random random = new Random();
        int[] a = new int[10];
        int sum = 0;
        boolean yes = false;
        while (!yes) {
            sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(n);
                sum += a[i];
            }
            if (sum == k) {
                yes = true;
            } else {
                yes = false;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, n;
        System.out.println("Введите чило К");
        k = scanner.nextInt();
        System.out.println("Введите число N");
        n = scanner.nextInt();
        System.out.println(Arrays.toString(programme(k, n)));
    }
}
