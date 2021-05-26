package com.algorithmation.decomposition.d16;

import java.util.Scanner;

public class Main {

    public static int startRange(int n) {
        return (int) Math.pow(10, n) / 10;
    }

    public static int maxRange(int n) {
        return (int) Math.pow(10, n) - 1;
    }

    public static int count(int n) {
        int count;
        count = (n == 0) ? 1 : 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int sumOdd (int n) {
        int sum = 0;
        int check;
        int mult;
        int num;
        for (int i = startRange(n); i <= maxRange(n); i++) {
            check = 0;
            mult = (int) Math.pow(10, n) / 10;
            for (int j = 0; j < n; j++) {
                num = i / mult % 10;
                mult /= 10;
                if (num % 2 != 0) {
                    check++;
                }
                if (n == check) {
                    sum += i;
                }
            }
        } return sum;
    }

    public static int countOfEven(int sum) {
        int count = 0;
        int mult;
        int num;
        mult = (int) Math.pow(10, count(sum)) / 10;
        for (int i = 0; i < count(sum); i++) {
            num = sum / mult % 10;
            mult /= 10;
            if (num % 2 == 0) {
                count++;
            }
        } return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum;
        System.out.println("Введите количество цифр в числе:");
        num = scanner.nextInt();
        sum = sumOdd(num);
        System.out.printf("Сумма %d-значных чисел, содержащие только нечётные числа = %d\n", num, sum);
        System.out.println("Чётных цифр в найденной сумме: " + countOfEven(sum));
    }
}
