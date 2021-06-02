package com.stringsAndOthers.PatternMatcher.pm2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String string3 = "<notes>" +
                "<note id = '1'>" +
                "<to>Вася</to>" +
                "<from>Света</from>" +
                "<heading>Напоминание</heading>" +
                "<body>Позвони мне завтра!</body>" +
                "</note>" +
                "<note id = '2'>" +
                "<to>Петя</to>" +
                "<from>Маша</from>" +
                "<heading>Важное напоминание</heading>" +
                "<body/>" +
                "</note>" +
                "</notes>";

        System.out.println("Исходный текс:");
        System.out.println(string);
        System.out.println();


        Pattern pattern = Pattern.compile("(?<=</)\\w+?(?=>)");
        Matcher matcher = pattern.matcher(string3);
        StringBuilder words = new StringBuilder();
        while (matcher.find()) {
            words.append(string3.substring(matcher.start(), matcher.end()) + " ");
        }

        Pattern patternSplit = Pattern.compile(" ");
        String[] splited = patternSplit.split(words);

        for (int i = 0; i < splited.length; i++) {
            for (int j = i + 1; j < splited.length; j++) {
                if (splited[i].equals(splited[j])) {
                    splited[j] = "0";
                }
            }
        }

        StringBuilder wordsUnrepeated = new StringBuilder();

        for (int i = 0; i < splited.length; i++) {
            if (!splited[i].equals("0")) {
                wordsUnrepeated.append(splited[i] + " ");
            }
        }

        String[] splitedFinal = patternSplit.split(wordsUnrepeated);
        String regex;
        for (String word: splitedFinal) {
            regex = "(?<=<" + word + ">).+?(?=</" + word + ">)";
            Pattern pattern1 = Pattern.compile(regex);
            Matcher matcher1 = pattern1.matcher(string3);
            System.out.println("Содержимое узла:");
            if (!matcher.find()) {
                regex = "(?<=<" + word + ".>).+?(?=</" + word + ">)";
                pattern1 = Pattern.compile(regex);
                Matcher matcher2 = pattern1.matcher(string3);
                while (matcher2.find()){
                    System.out.println(string3.substring(matcher2.start(), matcher2.end()));
                }
            }
            while (matcher1.find()){
                System.out.println(string3.substring(matcher1.start(), matcher1.end()));
            }
            System.out.println("Тип узла: " + word);
            System.out.println();
        }

    }
}
