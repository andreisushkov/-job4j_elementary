package ru.job4j.condition;

public class Max {
    public  static int max(int left, int right) {
        boolean maxValue = left > right;
        int result = maxValue ? left : right;
        return result;

    }

    public static void main(String[] args) {
        int max1 = Max.max(7, 8);
        System.out.println("Максимальное число: " + max1);
        int max2 = Max.max(5, 4);
        System.out.println("Максимальное число: " + max2);
        int equality = Max.max(1, 1);
        System.out.println("Числа равны: " + equality);
    }
}
