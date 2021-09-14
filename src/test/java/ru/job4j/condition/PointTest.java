package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To14Then3() {
        double expected = 3;
        Point a = new Point(1, 1);
        Point b = new Point(1, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To22Then2Dot83() {
        double expected = 2.83;
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22To00Then2Dot83() {
        double expected = 2.83;
        Point a = new Point(2, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when222To000Then3Dot46() {
        double expected = 3.46;
        Point a = new Point(2, 2, 2);
        Point b = new Point(0, 0, 0);
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when444To333Then1Dot73() {
        double expected = 1.73;
        Point a = new Point(4, 4, 4);
        Point b = new Point(3, 3, 3);
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}