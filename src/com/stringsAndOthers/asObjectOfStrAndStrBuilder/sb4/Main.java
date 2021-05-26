package com.stringsAndOthers.asObjectOfStrAndStrBuilder.sb4;

public class Main {

    public static void main(String[] args) {
        String string = "информатика";
        String stringT = string.substring(7, 8);
        String stringOp = string.substring(3, 5);
        String stringCake = stringT + stringOp + stringT;
        System.out.println(stringCake);
    }
}