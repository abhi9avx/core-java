package com.company.ErrorException;

import java.util.Scanner;

/**
 * This program demonstrates how to handle multiple types of exceptions
 * using try-catch blocks in Java.
 * It covers:
 * - ArithmeticException (like division by zero)
 * - ArrayIndexOutOfBoundsException
 * - General Exception (fallback for any unexpected errors)
 */
public class ExceptionHandeling{
    public static void main(String[] args) {
        // Initialize an array with 3 values
        int[] marks = new int[3];
        marks[0] = 89;
        marks[1] = 35;
        marks[2] = 98;

        // Create scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask user for array index
        System.out.print("Enter the array index (0 to 2): ");
        int ind = sc.nextInt();

        // Ask user for a number to divide the array element with
        System.out.print("Enter the number you want to divide with: ");
        int number = sc.nextInt();

        // Use try-catch to handle possible exceptions
        try {
            // Might throw ArrayIndexOutOfBoundsException if index is invalid
            System.out.println("Value at index " + ind + ": " + marks[ind]);

            // Might throw ArithmeticException if number = 0
            System.out.println("Result of division: " + marks[ind] / number);
        }

        // Catch block for division errors (like divide by zero)
        catch (ArithmeticException e) {
            System.out.println("⚠️ Arithmetic Exception occurred (maybe division by zero).");
            System.out.println("Details: " + e);
        }

        // Catch block for array index errors
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Array Index Out of Bounds Exception occurred.");
            System.out.println("Details: " + e);
        }

        // Catch block for any other unexpected exception
        catch (Exception e) {
            System.out.println("⚠️ Some unexpected exception occurred.");
            System.out.println("Details: " + e);
        }

        // Always good to close the scanner
        sc.close();
    }
}