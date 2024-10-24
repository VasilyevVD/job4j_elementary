package ru.job4j.array;

import static ru.job4j.array.SwitchArray.swap;
import static ru.job4j.array.FindLoop.indexInRange;
import static ru.job4j.array.MinDiapason.findMin;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 1; index < data.length - 1; index++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
                index = FindLoop.indexInRange(data, index + 1, index - 1, data.length - 1);
                    swap(data, index - 1, index + 1);
        }
        return data;
    }
}