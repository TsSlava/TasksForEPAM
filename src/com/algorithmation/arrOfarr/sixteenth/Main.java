package com.algorithmation.arrOfarr.sixteenth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер магического квадрата: ");
        int size = scanner.nextInt();
        int nums[][] = new int[size][size];

        if (size % 2 != 0) {
            int a = size - 1;
            int b = size / 2;

            for (int i = 1; i <= size * size; i++) {
                nums[a++][b++] = i;
                if (i % size == 0) {
                    a = a - 2;
                    b = b - 1;
                } else {
                    a = a % size;
                    b = b % size;
                }
            }

            System.out.printf("Магический квадрат порядка %d выглядит следующим образом:", size);
            System.out.println();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(" " + nums[i][j]);
                }
                System.out.println();
            }
            return;

        }
        if (size % 4 > 0) {
            System.out.print("Число должны быть нечётным или кратным 4-ым!");
        } else {
            int c = 1, d = size * size;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i % 4 == j % 4 || (i + j) % 4 == 3) {
                        nums[i][j] = d;
                    } else {
                        nums[i][j] = c;
                    }
                    d--;
                    c++;
                }
            }

            System.out.printf("Магический квадрат порядка %d выглядит следующим образом:", size);
            System.out.println();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(" " + nums[i][j]);
                }
                System.out.println();
            }
        }
    }
}

