package com.basics.cycles.second;

import java.util.Scanner;

public class Main {

    static int a;
    static int b;
    static double h;


    public static void function () {
        double y;
        for (double x = a; x <= b - h; x += h) {
            System.out.print("x = " + x + ", ");
            if (x > 2) {
                y = x;
                System.out.println("y = " + y);
            } else if (x <= 2) {
                y = -x;
                System.out.println("y = " + y);            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальную точку отрезка:");
        a = scanner.nextInt();
        System.out.println("Введите конечную точку отрезка:");
        b = scanner.nextInt();
        System.out.println("Введите шаг:");
        h = scanner.nextDouble();
        function();
    }
}
