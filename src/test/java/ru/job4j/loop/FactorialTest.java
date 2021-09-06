package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
       int expected = 120;
       int num = 5;
       int out = Factorial.calc(num);
       Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int num = 0;
        int out = Factorial.calc(num);
        Assert.assertEquals(expected, out);
    }
}