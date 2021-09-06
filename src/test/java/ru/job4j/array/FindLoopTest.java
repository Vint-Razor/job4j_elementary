package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] date = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(date, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot5ThenMinus1() {
        int[] date = {8, 3, 4, 9, 1};
        int el = 5;
        int result = FindLoop.indexOf(date, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}