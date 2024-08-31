package ru.job4j.loop;

public class Counter {
    public  static int sum(int start, int finish) {
        int sum = 0;
        int result = start + finish;
        for (start = 0; start <= finish; start++) {
            sum = sum + result;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
