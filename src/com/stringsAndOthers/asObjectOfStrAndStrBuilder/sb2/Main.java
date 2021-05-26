package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "The new aircraft has landed.";
        Pattern pattern = Pattern.compile("[Aa]");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Исходный текст: " + text);
        System.out.println("Изменённый текст: " + matcher.replaceAll("ab"));

//        Или:
//        StringBuilder textSB = new StringBuilder();
//        String[] words = text.split("");
//        for (String word: words) {
//            if(word.contains("a")) {
//                textSB.append(word + "b");
//            } else {
//                textSB.append(word);
//            }
//        }
//        System.out.println(textSB);
    }
}
