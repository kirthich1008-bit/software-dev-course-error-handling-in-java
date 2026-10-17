package org.example;

import java.util.List;

/**
 * Main exercise class.
 */
public class Main {
    /**
     * Divide two numbers, throwing an unchecked ArithmeticException if the denominator is zero.
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */
    private static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    /**
     * Divide two numbers safely. If the denominator is zero, it will return 0.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */
    public static double safeDivision(double a, double b) {
        try {
            return divide(a, b);
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    /**
     * Get the second letter of a string.
     *
     * @param s String to get the second letter from
     * @param logMessages List of log messages to add to
     * @return The second letter of the string
     */
    public static String getSecondLetter(String s, List<String> logMessages) {
        String result;
        try {
            result = s.substring(1, 2);
        } catch (StringIndexOutOfBoundsException e) {
            result = "";
        } finally {
            logMessages.add("Exiting method");
        }
        return result;
    }

    /**
     * Safely divide two numbers. If the denominator is zero, it will throw a custom exception.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     * @throws CustomDivideByZeroException If the denominator is zero
     */
    public static double safeDivideWithCustomException(double a, double b) throws CustomDivideByZeroException {
        try {
            return divide(a, b);
        } catch (ArithmeticException e) {
            throw new CustomDivideByZeroException(a, b);
        }
    }
}