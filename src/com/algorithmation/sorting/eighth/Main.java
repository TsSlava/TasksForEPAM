package com.algorithmation.sorting.eighth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fraction> list = new ArrayList<>(Arrays.asList(new Fraction(9, 12), new Fraction(1, 2),
                new Fraction(3, 4), new Fraction(6, 7), new Fraction(1, 5), new Fraction(7, 8),
                new Fraction(9, 10), new Fraction(1, 2), new Fraction(5, 12), new Fraction(3, 8)));


        long lcd = list.stream().mapToLong(f -> f.d).reduce(1, (d1, d2) -> d1 * d2 / change(d1, d2));
        list.stream().map(f -> f.setLCD(lcd)).sorted(Fraction::sort).forEach(System.out::println);

    }

    static long change(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static class Fraction {
        long n, d;

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        public Fraction setLCD(long lcd) {
            n *= (lcd / d);
            d = lcd;
            return this;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", n, d);
        }

        public static int sort(Fraction f1, Fraction f2) {
            return Long.compare(f1.n, f2.n);
        }
    }

}
