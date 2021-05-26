package com.algorithmation.decomposition.fourth;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    int size;
    char letter = 65;
    char letterMaxX = 0;
    char letterMaxY = 0;
    double length = 0;
    double maxLength = 0;

    public void coordinatesEncounter() {
        int[] numsX = new int[size];
        int[] numsY = new int[size];
        char[] letters = new char[size];
        System.out.println("Введите координаты точек:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Координата точки %c:\n", letter);
            System.out.print("X = ");
            numsX[i] = scanner.nextInt();
            System.out.print("Y = ");
            numsY[i] = scanner.nextInt();
            letters[i] = letter;
            letter++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                length = Math.sqrt(Math.pow((numsX[j] - numsX[i]), 2) + Math.pow((numsY[j] - numsY[i]), 2));
                if (length > maxLength) {
                    maxLength = length;
                    letterMaxX = letters[i];
                    letterMaxY = letters[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Введите количество точек:");
        main.size = main.scanner.nextInt();
        main.coordinatesEncounter();
        System.out.printf("Самое большое расстояние между точками %c и %c равное %f.", main.letterMaxX, main.letterMaxY, main.maxLength);
    }
}
