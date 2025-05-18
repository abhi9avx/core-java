package com.company.ErrorException;

import java.util.Scanner;

/**
 * Demonstrates Nested Try-Catch in Java.
 * - Outer try-catch handles any general exceptions.
 * - Inner try-catch handles specific exception (ArrayIndexOutOfBounds).
 */
public class Nested_try_catch {
    public static void main(String[] args) {
        // Creating an array with 3 elements (index 0 to 2)
        int[] marks = new int[3];
        marks[0] = 89;
        marks[1] = 35;
        marks[2] = 98;

        Scanner sc = new Scanner(System.in);

        // Taking user input for index
        System.out.print("Enter the index of the array (0 to 2): ");
        int ind = sc.nextInt();

        // Outer try block
        try {
            System.out.println("🟢 Welcome to my world!");

            // Inner try block — specific for array index handling
            try {
                // This may throw ArrayIndexOutOfBoundsException
                System.out.println("Value at index " + ind + ": " + marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("⚠️ Sorry, this index does not exist in the array.");
                System.out.println("👉 Handled in Inner Try-Catch (Level 2)");
                System.out.println("Details: " + e);
            }

        } catch (Exception e) {
            // Outer catch block for any unexpected exceptions
            System.out.println("⚠️ Some other exception occurred.");
            System.out.println("👉 Handled in Outer Try-Catch (Level 1)");
            System.out.println("Details: " + e);
        }

        // Closing Scanner object
        sc.close();
    }
}

/*


Purpose
🟢 Outer try
General execution area. If any unexpected exception occurs, it is caught here.
⚠️ Inner try
Handles the specific operation that might throw ArrayIndexOutOfBoundsException.
✅ Inner catch
Catches and handles invalid index access with a user-friendly message.
🧯 Outer catch
Acts as a safety net for any exceptions not caught inside.

 */