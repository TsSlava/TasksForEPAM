package com.basics.linear.fifth;

import java.util.Scanner;

public class Main {

    public static void converterInTime(int num) {
        int sec = num - (num / 60) * 60;
        int hours = ((num - sec) / 60) / 60;
        int min = num / 60 - hours * 60;
        System.out.printf("Number in seconds %d is %d hours, %d minutes and %d seconds.", num, hours, min, sec);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        converterInTime(scanner.nextInt());
    }
}
