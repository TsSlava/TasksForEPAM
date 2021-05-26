package com.algorithmation.decomposition.d17;

import java.util.Scanner;

public class Main {

    public static int count(int n) {
        int count = (n == 0) ? 1 : 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int sumOfDig (int n) {
        int sum = 0;
        int mult = (int) Math.pow(10, count(n)) / 10;
        int num;
        for (int i = 0; i < count(n); i++) {
            num = n / mult % 10;
            mult /= 10;
            sum += num;
        }
        return sum;
    }

    public static int programme (int n) {
        int count = 0;
        int result;
        while (n!=0) {
            result = n - sumOfDig(n);
            n = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        System.out.println("Количество раз до нуля: " + programme(num));
    }
}
