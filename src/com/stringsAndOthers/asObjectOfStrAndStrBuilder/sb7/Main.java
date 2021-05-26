package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        String newString;
        newString = string.replaceAll("\\s+", "").trim();
        StringBuilder stringBuilder = new StringBuilder();
        int index = 1;
        char[] words = newString.toCharArray();
        for (int i = 1; i < newString.length(); i++) {
            int j;
            for (j = 0; j < index; j++) {
                if (words[i] == words[j]) {
                    break;
                }
            }
            if (j == index) {
                words[index] = words[i];
                ++index;
            } else {
                words[index] = 0;
                ++index;
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i] != 0) {
                stringBuilder.append(words[i]);
            }
        }

        System.out.println("Строка после: " + stringBuilder);

    }
}
