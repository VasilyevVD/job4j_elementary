package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double value = 0.01f;
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = distance(-1, -1, 1, 1);
        System.out.println("result (-1, -1) to (1, 1) " + result1);
        double result2 = distance(-2, -2, 2, 2);
        System.out.println("result (-2, -2) to (2, 2) " + result2);
    }
}
