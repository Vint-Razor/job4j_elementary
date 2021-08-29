package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float esp = 0.0001F;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert150RblThen2Dlr5Cents() {
        float in = 150;
        float expected = 2.5F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }
}