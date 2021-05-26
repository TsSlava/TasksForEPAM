package com.algorithmation.decomposition.ninth;

public class Main {

    public static double squareTriangleRight(int x, int y) {
        return 0.5 * x * y;
    }

    public static double squareTheSecondTriangle(int x, int y, int z, int t) {
        double c = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double p = (x + y + c) / 2;
        return Math.sqrt(p * (p - z) * (p - t) * (p - c));
    }


    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int z = 3;
        int t = 6;
        double square = squareTriangleRight(x, y) + squareTheSecondTriangle(x, y, z, t);
        System.out.printf("Площать четырёхугольника, гда угол между X и Y - прямой, со сторонами %d, %d, %d, %d = %f", x, y, z, t, square);
    }
}
