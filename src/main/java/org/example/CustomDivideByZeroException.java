package org.example;

/**
 * Custom exception for dividing by zero.
 */
public class CustomDivideByZeroException extends Exception {
    /**
     * The numerator of the failed division operation.
     */
    private final double a;

    /**
     * The denominator of the failed division operation.
     */
    private final double b;

    /**
     * Get the numerator of the failed division operation.
     *
     * @return The numerator of the failed division operation.
     */
    public double getA() {
        return a;
    }

    /**
     * Get the denominator of the failed division operation.
     *
     * @return The denominator of the failed division operation.
     */
    public double getB() {
        return b;
    }

    /**
     * Constructor for the CustomDivideByZeroException.
     *
     * @param a The numerator of the failed division operation.
     * @param b The denominator of the failed division operation.
     */
    public CustomDivideByZeroException(double a, double b) {
        // Pass a descriptive message with the numbers to the parent exception
        super(String.format("Attempted to divide by zero: %s / %s", a, b));
        this.a = a;
        this.b = b;
    }
}
