package com.algorithmation.decomposition.first;

import java.util.Scanner;

public class Main {

    int a;
    int b;

    public int nod(int a, int b) {
        int a2;
        int b2;
        int remainder;
        b2 = a % b;
        a2 = b;
        if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        } else  if (a2 % b2 == 0){
            return b2;
        } else {
            do {
                remainder = a2 % b2;
                a2 = b2;
                b2 = remainder;

            } while (a2 % b2 != 0);
            return remainder;
        }
    }

    public int nok() {
        return (a * b) / nod(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        System.out.println("Введите первое число:");
        main.a = scanner.nextInt();
        System.out.println("Введите второе число:");
        main.b = scanner.nextInt();
        System.out.printf("Наибольший общий делитель чисел %d и %d это число %d\n", main.a, main.b, main.nod(main.a, main.b));
        System.out.printf("Наименьшее общее кратное чисел %d и %d это число %d", main.a, main.b, main.nok());
    }
}

