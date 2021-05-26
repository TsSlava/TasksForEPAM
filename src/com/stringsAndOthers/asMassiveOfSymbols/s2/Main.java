package com.stringsAndOthers.asMassiveOfSymbols.s2;

public class Main {

    public static void main(String[] args) {
        String string = "My word is good word, and your word is the best word.";
        System.out.println("Первая строка: " + string);
        String string2 = string.replace("word", "letter");
        System.out.println("Вторая строка с заменой: " + string2);
    }
}

