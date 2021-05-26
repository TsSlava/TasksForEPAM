package com.basics.branching.fifth;

import java.util.Scanner;

public class Main {

    public static double function (int x) {
        double y = 0;
        if (x <= 3) {
            y = (Math.pow(x, 2) - 3 * x + 9);
        }
        if (x > 3) {
            y =  (1/(Math.pow(x, 3) + 6));
        } return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        System.out.println(function(scanner.nextInt()));
    }
}
