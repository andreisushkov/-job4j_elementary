package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        short womenHeight = 167;
        double man = Fit.manWeight(height);
        double women = Fit.womanWeight(womenHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Women 167 is " + women);
    }

}
