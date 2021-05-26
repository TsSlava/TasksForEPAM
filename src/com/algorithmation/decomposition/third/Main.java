package com.algorithmation.decomposition.third;

import java.util.Scanner;

public class Main {

    static public double square(int a) {
        return 6 * (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны правильного шестиугольника:");
        System.out.println("Площадь равна: " + square(scanner.nextInt()));
    }
}
