package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("   Идущий  во    тьме не видет  дороги ");
        int max = 0;
        int startPosition = 0;
        int endPosition = 0;
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int num;
            int start = matcher.start();
            int end = matcher.end();
            num = end - start;
            if (max < num) {
                max = num;
                startPosition = start;
                endPosition = end;
            }
        }

        System.out.println("Исходный текст:\n" + text);
        System.out.printf("Наибольшее количество пробелов подряд: %d (c %d-ой по %d-ую позиции массивов символов).", max, startPosition, endPosition);

    }
}