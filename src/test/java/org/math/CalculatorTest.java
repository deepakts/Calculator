package org.math;

import org.junit.Test;

import  org.junit.Assert;

/**
 * Created by deepak on 14/2/15.
 * Project Name : ${PROJECT_NAME}
 */
public class CalculatorTest {
    @Test
    public  void addTest(){
        Calculator c = new Calculator();
        Assert.assertEquals(5, c.add(3, 2));
    }
}
