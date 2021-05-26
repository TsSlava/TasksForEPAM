package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите англоязычное предложение с заглавными буквами:");
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(string);
        Matcher matcher2 = pattern2.matcher(string);
        int count = 0;
        int count2 = 0;
        while (matcher.find()){
            count++;
        }
        while (matcher2.find()){
            count2++;
        }
        System.out.println("Количество заглавных букв: " + count);
        System.out.println("Количество прописных букв: " + count2);
    }
}
