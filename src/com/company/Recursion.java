package com.company;

/**
 * 📘 Java Concept: Recursion vs Iteration for Factorial Calculation
 *
 * 🔹 What is Recursion?
 * - A method calling itself is known as **recursion**.
 * - Useful for solving problems that can be broken into smaller sub-problems (divide & conquer).
 *
 * 🔹 Factorial Definition:
 * - Factorial of a number n (n!) = n * (n-1) * (n-2) * ... * 1
 * - Special case: 0! = 1 and 1! = 1
 *
 * 🔸 Two ways to calculate factorial:
 *   1. Recursive approach
 *   2. Iterative approach using a loop
 */

public class Recursion {

    /**
     * 🔁 Recursive factorial function
     * factorial(n) = n * factorial(n - 1)
     * Base Case: factorial(0) = 1 and factorial(1) = 1
     */
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base condition
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    /**
     * 🔃 Iterative factorial function using loop
     */
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        // 📌 Testing both approaches for multiple inputs

        System.out.println("📍 Recursive Method:");
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Factorial of 0 is: " + factorial(0));
        System.out.println("Factorial of 10 is: " + factorial(10));

        System.out.println("\n📍 Iterative Method:");
        System.out.println("Factorial of 5 is: " + fact(5));
        System.out.println("Factorial of 0 is: " + fact(0));
        System.out.println("Factorial of 10 is: " + fact(10));
    }
}