package com.stringsAndOthers.asMassiveOfSymbols.s1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"EternalLife", "HateSmoking", "UglyRoad"};
        Pattern pattern = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < strings.length; i++) {
            Matcher matcher = pattern.matcher(strings[i]);
            StringBuilder stringBuilder = new StringBuilder();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuilder, "_$0");
            }
            matcher.appendTail(stringBuilder);
            strings[i] = stringBuilder.toString().toLowerCase();
        }

        System.out.println(Arrays.toString(strings));
    }
}