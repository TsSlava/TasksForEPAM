package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb3;

import java.util.Scanner;

public class Main {

    static String text;

    public static boolean isPalindrom(String text) {
        StringBuilder textStrB = new StringBuilder(text);
        textStrB.reverse();
        return text.equalsIgnoreCase(textStrB.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        text = scanner.next();
        System.out.println("Является ли слово палиндромом: " + isPalindrom(text));
    }
}
