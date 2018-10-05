/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5tutorial;

/**
 *
 * @author Administrator
 */
public class Calculator {

    public int add(int x, int z) {
        return x + z;
    }

    public int subtract(int i, int i0) {
        return i - i0;
    }

    public int multiply(int i, int i0) {
        return i * i0;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Division by Zero");
        }
        return x / y;
    }

}
