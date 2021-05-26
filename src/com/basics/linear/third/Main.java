package com.basics.linear.third;

public class Main {

    public static double function(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

    public static void main(String[] args) {
        System.out.println(function(45, 44));
    }
}
