package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        int expected = 1;
        String day = "Monday";
        int out = MultipleSwitchWeek.numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSredaThen3() {
        int expected = 3;
        String day = "Среда";
        int out = MultipleSwitchWeek.numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenHelloThenErr1() {
        int expected = -1;
        String day = "Hello";
        int out = MultipleSwitchWeek.numberOfDay(day);
        Assert.assertEquals(expected, out);
    }
}