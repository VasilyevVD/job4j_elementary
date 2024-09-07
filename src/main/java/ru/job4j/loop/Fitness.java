package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int mounth = 0;
        int result = ivan / nik;
        while (ivan > nik) {
            ivan *= 3;
            nik *= 2;
            mounth += result;
        }
        return mounth;
    }
}