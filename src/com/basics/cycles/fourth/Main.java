package com.basics.cycles.fourth;

import java.math.BigInteger;

public class Main {
    public static void multiSquares() {
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            sum = sum.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        multiSquares();
    }
}
