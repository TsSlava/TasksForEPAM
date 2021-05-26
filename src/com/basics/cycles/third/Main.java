package com.basics.cycles.third;

public class Main {

    public static int sumSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumSquares());
    }
}
