package com.jomilto.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void return_zero_when_there_are_no_prices(){
        PriceCalculator calculator = new PriceCalculator();

        assertEquals( 0.0, calculator.getTotal(),0);
    }

    @Test
    public void return_the_sum_of_the_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.3);
        calculator.addPrice(15.2);
        calculator.addPrice(20.5);

        assertEquals(46,calculator.getTotal(),0);
    }

    @Test
    public void return_the_sum_of_the_prices_applying_discount() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.3);
        calculator.addPrice(15.2);
        calculator.addPrice(20.5);
        calculator.setDiscount(50);

        assertEquals(23,calculator.getTotal(),0);

        calculator.setDiscount(25);

        assertEquals(34.5,calculator.getTotal(),0);
    }
}