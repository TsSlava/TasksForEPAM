package com.basics.linear.sixth;

public class Main {

    public static boolean coordinates(int x, int y) {
        return (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0);
    }

    public static void main(String[] args) {
        System.out.println(coordinates(-3, 2));
    }
}
