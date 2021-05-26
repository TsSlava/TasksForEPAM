package com.basics.linear.second;

public class Main {

    public static double function(int a, int b, int c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        System.out.println(function(1, 1, 1));
    }
}
