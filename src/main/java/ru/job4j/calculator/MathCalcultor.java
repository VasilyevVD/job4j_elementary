package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.dif;
import static ru.job4j.math.MathFunction.division;
import static ru.job4j.math.MathFunction.sum;
import  static ru.job4j.math.MathFunction.multiply;

public class MathCalcultor {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }
    public static double difAndDivision(double first, double second) {
        return dif(first,second)
                + division(first,second);
    }
    public static double sumOfFour(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                  + dif(first,second)
                    + division(first,second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumOfFour(10, 20));
    }
}
