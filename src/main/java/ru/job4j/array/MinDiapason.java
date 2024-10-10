package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = 1; i < array.length; i++) {
            if (start <= i && i <= finish && array[i] < min) {
                min = array[i];
            }

        } return min;
    }
}