package com.calc;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    @Test
    void testSqrt() {
        assertEquals(5.0, ScientificCalculator.sqrt(25));
    }

    @Test
    void testFactorial() {
        assertEquals(BigInteger.valueOf(120), ScientificCalculator.factorial(5));
    }

    @Test
    void testLn() {
        assertEquals(1.0, ScientificCalculator.ln(Math.E), 0.0001);
    }

    @Test
    void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2,3));
    }

    @Test
    void testSqrtNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.sqrt(-5);
        });
    }
}