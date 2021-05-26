package com.stringsAndOthers.asMassiveOfSymbols.s3;

public class Main {

    public static void main(String[] args) {
        String string = "Я родился 19 декабря 1989 года.";
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (char j = 48; j < 58; j++) {
                if (chars[i] == j) {
                    count++;
                }
            }
        }

//        Или этот вариант:

//        Pattern pattern = Pattern.compile("[0-9]");
//        Matcher matcher = pattern.matcher(string);
//        while (matcher.find()) {
//            count++;
//        }


        System.out.println("Строка: " + string + "\nКоличество цифр в строке: " + count);
    }
}
