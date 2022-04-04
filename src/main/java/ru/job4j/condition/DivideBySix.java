package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String result1 = DivideBySix.checkNumber(24);
        System.out.println(result1);
        String result2 = DivideBySix.checkNumber(9);
        System.out.println(result2);
        String result3 = DivideBySix.checkNumber(14);
        System.out.println(result3);
        String result4 = DivideBySix.checkNumber(25);
        System.out.println(result4);

    }
}