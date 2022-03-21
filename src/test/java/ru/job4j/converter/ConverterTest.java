package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenCovert140RblThen2Dollar() {
        float in = 140;
        float expected = (float) 2.3333333;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}