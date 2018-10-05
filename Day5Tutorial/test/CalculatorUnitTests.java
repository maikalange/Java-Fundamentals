/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import day5tutorial.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Administrator
 */
public class CalculatorUnitTests {

    private Calculator calc; //instance field for the calculator

    @Before //test initialise runs before each test
    public void initialiseTest() {
        calc = new Calculator();
    }

    public CalculatorUnitTests() {
    }

    @Test
    public void testAdd() { //a test to test the add method

        int expected = 42;
        int actual = calc.add(20, 22);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 10;
        int actual = calc.subtract(40, 30);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 1200;
        int actual = calc.multiply(40, 30);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        double expected = 1.33333;
        double actual = calc.divide(40, 30);

        assertEquals(expected, actual, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(40, 0);
    }
}
