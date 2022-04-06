package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            System.out.println(i);
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
