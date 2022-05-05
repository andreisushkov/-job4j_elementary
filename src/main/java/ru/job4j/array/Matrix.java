package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int row = 1; row <= data.length; row++) {
            for (int cell = 1; cell <= data.length; cell++) {
               data[row - 1][cell - 1] = row * cell;
            }
        }
        return data;
    }

}
