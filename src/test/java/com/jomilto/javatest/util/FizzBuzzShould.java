package com.jomilto.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_Fizz_when_number_is_divisible_by_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(36));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(63));
    }

    @Test
    public void return_Buzz_when_number_is_divisible_by_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(50));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));
    }

    @Test
    public void return_FizzBuzz_when_number_is_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void return_number_when_number_is_not_divisible_by_3_or_5() {
        assertEquals(""+ 2 + "", FizzBuzz.fizzBuzz(2));
        assertEquals(""+ 4 + "", FizzBuzz.fizzBuzz(4));
        assertEquals(""+ 16 + "", FizzBuzz.fizzBuzz(16));
    }
}