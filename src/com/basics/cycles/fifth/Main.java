package com.basics.cycles.fifth;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        double e = 0.001;
        for (int i = 1; ; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) < e) {
                break;
            }
            sum += a;
        }
        System.out.println(sum);
    }
}
