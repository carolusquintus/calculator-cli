package dev.carv.calculator;

/**
 * Basic implementation of a class Calculator.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a first number to add.
     * @param b second number to add.
     * @return the sum of both numbers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtraction of two numbers.
     * @param a first  number to subtract.
     * @param b second number to subtract.
     * @return the subtraction of both numbers.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiply two numbers.
     * @param a first number to multiply.
     * @param b second number to multiply.
     * @return the multiplication of both numbers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Division of two numbers.
     *
     * @param a first number to divide.
     * @param b second number as dividend.
     * @return the result of both division.
     */
    public double divide(int a, int b) {
        return a / b;
    }
}