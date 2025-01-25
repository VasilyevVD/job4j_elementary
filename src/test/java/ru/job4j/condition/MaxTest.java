package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void max2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    void testMax3() {
        int first = 3;
        int left = 4;
        int right = 5;
        int result = Max.max(first, left, right);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    void testMax4() {
        int first = 6;
        int left = 7;
        int right = 8;
        int second = 9;
        int result = Max.max(first, left, right, second);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }
}