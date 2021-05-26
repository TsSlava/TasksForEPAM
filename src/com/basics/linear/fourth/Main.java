package com.basics.linear.fourth;

public class Main {

    public static double changePlaces(double var) {
        return (var * 1000) % 1000 + (int)var / 1000.0;
    }

    public static void main(String[] args) {
        System.out.println(changePlaces(123.546));
    }
}
