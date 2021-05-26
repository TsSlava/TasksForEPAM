package com.stringsAndOthers.asMassiveOfSymbols.s5;

public class Main {

    public static void main(String[] args) {
        String string = "   Идущий  во    тьме не видет  дороги ";
        System.out.println("Строка до: \n" + string);
        System.out.println("Строка после: \n" + string.replaceAll("\\s+"," ").trim());
    }
}
