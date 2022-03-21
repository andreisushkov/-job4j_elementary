package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(second, first);
    }

    public static double allSumOfMethods(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + division(second, first);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 1го задания равен " + differenceAndDivision(10, 20));
        System.out.println("Резульат расчета 2го задания равен " + allSumOfMethods(10, 20));
    }

}
