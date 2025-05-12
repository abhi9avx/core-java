package com.company;

/**
 * 📘 Java Concept: Variable Arguments (VarArgs)
 *
 * 🔹 Problem: We often want to create multiple overloaded methods to sum 2, 3, 4, or more numbers.
 * 🔹 Solution: Use VarArgs — introduced in Java 5 to allow passing variable number of arguments.
 *
 * 🔸 Syntax:
 *     static int methodName(int... args) { }
 *     - Internally, Java treats `int...` as an array: `int[] args`
 *     - You can call it with 0 or more int arguments
 *
 * 🔸 You can also mandate at least one parameter:
 *     static void foo(int x, int... arr) { }
 *
 * ✅ Benefits:
 * - Cleaner code (no need for method overloading for every arg count)
 * - More flexible and scalable
 *
 * ❌ Rule: Only one VarArg allowed per method, and it must be the **last** parameter.
 */

public class VariableArguments {

    // ✅ VarArgs method to calculate sum of any number of integers
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("🎯 Welcome to VarArgs Tutorial");

        // 🔸 Calling sum with different number of arguments
        System.out.println("The Sum of 2 + 5 is -> " + sum(2, 5));
        System.out.println("The Sum of 2 + 5 + 7 is -> " + sum(2, 5, 7));
        System.out.println("The Sum of 2 + 5 + 7 + 8 is -> " + sum(2, 5, 7, 8));
        System.out.println("The Sum of nothing (0 args) is -> " + sum());  // returns 0
    }
}


// Old Way of solving this
// ✅ Traditional Method Overloading (before Java 5)
//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }