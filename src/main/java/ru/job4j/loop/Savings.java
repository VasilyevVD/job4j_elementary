package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        double start = 0;
        do {
            start += annualDeposit * (percent / 100);
            total  += total * (percent / 100) + annualDeposit;
            years++;
        } while (total < goal);
        return years;
    }
}