package com.algorithmation.decomposition.second;

import java.util.Scanner;

public class Main {

    int a;
    int b;
    int c;
    int d;

    public int nodFourth(int a, int b, int c, int d) {
        int a2;
        int b2;
        int remainder;
        int temp;
        int temp2;
        b2 = a % b;
        a2 = b;
        if (a % b == 0) {
            temp = b;
        } else if (b % a == 0) {
            temp = a;
        } else  if (a2 % b2 == 0){
            temp = b2;
        } else {
            do {
                remainder = a2 % b2;
                a2 = b2;
                b2 = remainder;

            } while (a2 % b2 != 0);
            temp = remainder;
        }
        b2 = temp % c;
        a2 = c;
        if (temp % c == 0) {
            temp2 = c;
        } else if (c % temp == 0) {
            temp2 = temp;
        } else  if (a2 % b2 == 0){
            temp2 = b2;
        } else {
            do {
                remainder = temp % c;
                a2 = b2;
                b2 = remainder;
            } while (a2 % b2 != 0);
            temp2 = remainder;
        }
        b2 = temp2 % d;
        a2 = d;
        if (temp2 % d == 0) {
            return d;
        } else if (d % temp2 == 0) {
            return temp2;
        } else  if (a2 % b2 == 0){
            return temp2;
        } else {
            do {
                remainder = a2 % b2;
                a2 = b2;
                b2 = remainder;

            } while (a2 % b2 != 0);
            return remainder;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        System.out.println("Введите первое число:");
        main.a = scanner.nextInt();
        System.out.println("Введите второе число:");
        main.b = scanner.nextInt();
        System.out.println("Введите третье число:");
        main.c = scanner.nextInt();
        System.out.println("Введите четвёртое число:");
        main.d = scanner.nextInt();
        System.out.printf("Наибольший общий делитель чисел %d, %d, %d и %d это число %d\n", main.a, main.b, main.c, main.d, main.nodFourth(main.a, main.b, main.c, main.d));
    }
}
