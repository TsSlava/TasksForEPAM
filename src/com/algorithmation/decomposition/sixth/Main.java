package com.algorithmation.decomposition.sixth;

import java.util.Scanner;

public class Main {

    int a;
    int b;
    int c;

    public int nod(int a, int b, int c) {
        int a2;
        int b2;
        int remainder;
        int temp;
        int temp2;
        b2 = a % b;
        a2 = b;
        if (a % b == 0) {
            temp2 = b;
        } else if (b % a == 0) {
            temp2 = a;
        } else  if (a2 % b2 == 0){
            temp2 = b2;
        } else {
            do {
                remainder = a2 % b2;
                a2 = b2;
                b2 = remainder;

            } while (a2 % b2 != 0);
            temp2 = remainder;
        }
        b2 = temp2 % c;
        a2 = c;
        if (temp2 % c == 0) {
            return c;
        } else if (c % temp2 == 0) {
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

    public void ifSimpleNumber(int remainder) {
        if (remainder == 1) {
            System.out.println("Числа являются взаимно простыми");
        } else {
            System.out.println("Числа НЕ являются взаимно простыми");
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
        main.ifSimpleNumber(main.nod(main.a, main.b, main.c));
        System.out.printf("Наибольший общий делитель чисел %d, %d и %d это число %d\n", main.a, main.b, main.c, main.nod(main.a, main.b, main.c));
    }
}
