package com.stringsAndOthers.asMassiveOfSymbols.s4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "Я родился 19 декабря 1989 года.";
        int count = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            count++;
        }

// Или этот вариант:
//        String[] words = string.split(" ");
//        for (String word : words) {
//            int k;
//            char[] chars = word.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                k = 0;
//                for (char j = 48; j < 58; j++) {
//                    if (chars[i] == j) {
//                        count++;
//                        k= 1;
//                    }
//                }
//                if (k == 1) {
//                    break;
//                }
//            }
//        }

        System.out.println(count);
    }
}
