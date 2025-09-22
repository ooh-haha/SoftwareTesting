package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorComponentTest {
    private final Calculator calc = new Calculator();

    // add
    @Test public void add_twoPositives_returnsSum() {
        assertEquals(7, calc.add(3, 4));
    }
    @Test public void add_withZero_returnsOther() {
        assertEquals(5, calc.add(5, 0));
        assertEquals(-2, calc.add(0, -2));
    }
    @Test public void add_withNegatives_returnsSum() {
        assertEquals(-9, calc.add(-5, -4));
    }

    // subtract
    @Test public void subtract_twoPositives_returnsDifference() {
        assertEquals(1, calc.subtract(5, 4));
    }
    @Test public void subtract_resultCanBeNegative() {
        assertEquals(-3, calc.subtract(2, 5));
    }

    // multiply
    @Test public void multiply_basic_returnsProduct() {
        assertEquals(12, calc.multiply(3, 4));
    }
    @Test public void multiply_withZero_returnsZero() {
        assertEquals(0, calc.multiply(999, 0));
        assertEquals(0, calc.multiply(0, -7));
    }
    @Test public void multiply_withNegative_returnsSignAccordingly() {
        assertEquals(-12, calc.multiply(3, -4));
        assertEquals(12, calc.multiply(-3, -4));
    }

    // divide
    @Test public void divide_exactDivision_returnsQuotient() {
        assertEquals(3, calc.divide(9, 3));
    }
    @Test public void divide_truncatesTowardZero_forIntegers() {
        assertEquals(2, calc.divide(7, 3));
        assertEquals(-2, calc.divide(-7, 3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIAE() {
        calc.divide(10, 0);
    }
}
