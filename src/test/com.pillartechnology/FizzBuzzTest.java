package com.pillartechnology;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedNumberItReturnsTheNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.fizz(1));
    }
}
