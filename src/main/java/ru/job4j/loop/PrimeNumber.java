package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
        } return count;
    }
}