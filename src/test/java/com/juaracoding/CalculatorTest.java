package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.add(10,5),15);
    }

    @Test
    public void substract(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.substract(10,5),5);
    }
}
