package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор слов в ряд через пробел:");
        String string = scanner.nextLine();
        int max = 0;
        String stringMax = null;
        String[] strings = string.split(" ");
        for (String word : strings) {
            if (word.length() > max) {
                max = word.length();
                stringMax = word;
            }
        }

        System.out.printf("Самое большое слово: '%s', c длинной %d знаков", stringMax, max);
    }
}
