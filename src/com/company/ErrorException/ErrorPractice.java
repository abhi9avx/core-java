package com.company.ErrorException;

/**
 * This class demonstrates common types of **Syntax Errors** in Java.
 * These errors occur during compilation when the code violates Java syntax rules.
 */
public class ErrorPractice {
    public static void main(String[] args) {

        // ❌ Error 1: Missing semicolon at the end of the statement
        // int a = 8  // ➤ Error: ';' expected

        // ❌ Error 2: Variable 'a' is not declared before use
        // a = 8;     // ➤ Error: cannot find symbol (symbol: variable a)

        // ✅ Correct declaration and initialization of a variable
        int a = 90;

        // ❌ Error 3: Using a variable 'c' which is not declared
        // System.out.println(c);  // ➤ Error: cannot find symbol (symbol: variable c)

        // ✅ Correct usage of declared variable
        System.out.println(a);  // ➤ Output: 90
    }
}

/*

🔍 Summary:

This code helps demonstrate:
	•	How syntax errors stop the compilation process.
	•	Importance of declaring variables before using them.
	•	Common beginner mistakes and how to fix them.
 */