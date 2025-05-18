package com.company.ErrorException;

// ✅ Custom Exception Class to handle negative radius
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "❌ Radius cannot be negative.";
    }

    @Override
    public String getMessage() {
        return "❌ Radius cannot be negative.";
    }
}

public class Throw_Throws {

    // ✅ Function that calculates area of a circle
    // 'throws' tells the caller that this method may throw NegativeRadiusException
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException(); // Manually throwing custom exception
        }
        return Math.PI * r * r;
    }

    // ✅ Simple divide function
    // Will throw ArithmeticException (if b == 0)
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) throws NegativeRadiusException {
        // TRY-CATCH to gracefully handle exceptions
        try {
            int result = divide(6, 0);  // Runtime error: division by zero
            System.out.println("Division result: " + result);

            double circleArea = area(6);  // Valid input
            System.out.println("Circle Area: " + circleArea);
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Arithmetic Exception Caught: " + e.getMessage());
        } catch (NegativeRadiusException e) {
            System.out.println("⚠️ Negative Radius Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ Some other exception occurred.");
        }

        // This line is outside try block and may throw exception if not handled above
        double circleArea = area(6);  // This will run fine as 6 is positive
        System.out.println("Area from outside try: " + circleArea);
    }
}

/*
throws helps other program to understand or to know the custom or expected exception in the program
 */