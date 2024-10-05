package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            for (int j = 0; j < prefix.length; j++) {
            if (j == index && prefix[j] != word[index]) {
                result = false;
                break;
                }
            }
        }
        return result;
    }
}
