package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1ThenMon() {
        String expected = "Понедельник";
        int day = 1;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when4ThenThor() {
        String expected = "Четверг";
        int day = 4;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when9ThenErr() {
        String expected = "Ошибка";
        int day = 9;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }
}