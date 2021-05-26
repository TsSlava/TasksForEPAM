package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение, заканчивающееся точкой, вопросительным или восклицательным знаками:");
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile("[.?!]");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()){
            count++;
        }

        System.out.println("Количество предложений в строке: " + count);
    }
}
