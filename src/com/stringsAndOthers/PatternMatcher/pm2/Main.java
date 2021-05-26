package com.stringsAndOthers.PatternMatcher.pm2;

public class Main {

    public static void main(String[] args) {
        String string = "<notes>\n\t" +
                "<note id = '1'>\n\t\t" +
                "<to>Вася</to>\n\t\t" +
                "<from>Света</from>\n\t\t" +
                "<heading>Напоминание</heading>\n\t\t" +
                "<body>Позвони мне завтра!</body>\n\t" +
                "</note>\n\t" +
                "<note id = '2'>\n\t\t" +
                "<to>Петя</to>\n\t\t" +
                "<from>Маша</from>\n\t\t" +
                "<heading>Важное напоминание</heading>\n\t\t" +
                "<body/>\n\t" +
                "</note>\n" +
                "</notes>";

        System.out.println(string);

    }
}
