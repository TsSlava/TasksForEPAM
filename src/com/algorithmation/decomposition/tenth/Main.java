package com.algorithmation.decomposition.tenth;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int count (int n) {
        int count;
        count = (n == 0) ? 1 : 0;
        while (n != 0) {
            count++;
            n /= 10;
        } return count;
    }

    public static int[] programme(int n) {
        int mult = 1;
        int[] nums = new int[count(n)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = n/mult % 10;
            mult *= 10;
        }
        return nums;
    }

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        a = scanner.nextInt();
        System.out.println(Arrays.toString(programme(a)));
    }
}
