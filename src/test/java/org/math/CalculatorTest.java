package org.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by deepak on 14/2/15.
 */
public class CalculatorTest {
    @Test
    public  void addTest(){
        Calculator c = new Calculator();
        assertEquals(5 , c.add(3,2));
    }
}
