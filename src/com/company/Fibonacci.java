package com.company;

/**
 * 📘 Java Concept: Fibonacci Series using Recursion
 *
 * 🔹 Fibonacci Series:
 * - A sequence where each number is the sum of the previous two.
 * - Starts from: F(0) = 0, F(1) = 1
 * - Formula: F(n) = F(n-1) + F(n-2) for n >= 2
 *
 * 🔹 Example:
 *   F(0) = 0
 *   F(1) = 1
 *   F(2) = F(1) + F(0) = 1
 *   F(3) = F(2) + F(1) = 2
 *   F(4) = F(3) + F(2) = 3
 *   F(5) = F(4) + F(3) = 5
 *
 * 🔸 This implementation uses **recursion**, which is simple but not efficient for large `n`
 *     because it recalculates the same values multiple times (Exponential Time Complexity).
 */

public class Fibonacci {

    /**
     * 🔁 Recursive method to find the nth Fibonacci number
     * @param n - index of Fibonacci series
     * @return - Fibonacci value at index n
     */
    static int fibonacciValue(int n) {
        if (n == 0 || n == 1) {
            return n;  // base cases
        } else {
            return fibonacciValue(n - 1) + fibonacciValue(n - 2);  // recursive calls
        }
    }

    public static void main(String[] args) {
        // 🔍 Testing Fibonacci values for specific indices
        System.out.println("Fibonacci of 0: " + fibonacciValue(0));  // 0
        System.out.println("Fibonacci of 1: " + fibonacciValue(1));  // 1
        System.out.println("Fibonacci of 3: " + fibonacciValue(3));  // 2
        System.out.println("Fibonacci of 5: " + fibonacciValue(5));  // 5
        System.out.println("Fibonacci of 8: " + fibonacciValue(8));  // 21

        int n = 10; // Number of terms
        System.out.print("Fibonacci Series (Recursive) up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciValue(i) + " ");
        }
    }
}