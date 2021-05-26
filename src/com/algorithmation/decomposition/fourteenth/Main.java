package com.algorithmation.decomposition.fourteenth;

import java.util.Scanner;

public class Main {

    public static int count(int n) {
        int count;
        count = (n == 0) ? 1 : 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void armstrong(int k) {
        int sum;
        int num;
        for (int i = 1; i < k; i++) {
            sum = 0;
            int mult = (int) Math.pow(10, count(i)) / 10;
            for (int j = 0; j < count(i); j++) {
                num = i / mult % 10;
                mult /= 10;
                sum += Math.pow(num, count(i));
            }
            if (sum == i) {
                System.out.print(sum + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Введите диапазон цифр:");
        num = scanner.nextInt();
        System.out.printf("Числа Армстронга в диапазоне цифр от 1 до %d: ", num);
        armstrong(num);
    }

}
