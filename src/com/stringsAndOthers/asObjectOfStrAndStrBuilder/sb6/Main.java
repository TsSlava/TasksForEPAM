package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb6;

import java.util.Scanner;

public class Main {

    static String string;

    public static String task (String text) {
        StringBuilder string2x = new StringBuilder();
        String[] strings = text.split("");
        for (String word: strings) {
            string2x.append(word);
            string2x.append(word);
        }
        return string2x.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        string = scanner.next();
        System.out.println(task(string));
    }
}
