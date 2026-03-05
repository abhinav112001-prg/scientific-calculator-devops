package com.calc;
import java.math.*;
public class ScientificCalculator
{
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number not allowed");
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static double ln(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("ln(x) is defined only for x > 0");
        }
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number not allowed");
        }
        return Math.sqrt(x);
    }
}
