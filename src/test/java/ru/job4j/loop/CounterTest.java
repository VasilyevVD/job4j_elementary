package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    @DisplayName("sum Start 0, Finish 10, Expected 55")
    void sumStart0Finish10() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("sum Start 3, Finish 8, Expected 33  ")
    void sumStart3Finish8() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("sum Star 1, Finish 1, Expeccted 1")
    void sumStart1Finish1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("sum Start 4, Finish 2, Expected 0")
    void sumStart4Finish2() {
        int start = 4;
        int finish = 2;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}