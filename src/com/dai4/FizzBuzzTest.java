package com.dai4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Test avec un nombre qui n'est ni un multiple de 3 ni de 5
        String result1 = fizzBuzz.fizzBuzzForNumber(7);
        assertEquals("7", result1);

        // Test avec un multiple de 3
        String result2 = fizzBuzz.fizzBuzzForNumber(9);
        assertEquals("Fizz", result2);

        // Test avec un multiple de 5
        String result3 = fizzBuzz.fizzBuzzForNumber(10);
        assertEquals("Buzz", result3);

        // Test avec un multiple de 3 et de 5
        String result4 = fizzBuzz.fizzBuzzForNumber(15);
        assertEquals("FizzBuzz", result4);
    }
}
