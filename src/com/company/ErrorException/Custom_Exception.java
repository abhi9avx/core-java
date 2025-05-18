package com.company.ErrorException;

import java.util.Scanner;

// Custom Exception class by extending Java's Exception class
class MyException extends Exception {

    // Overrides toString() — called when exception is printed directly (e.g., System.out.println(e))
    @Override
    public String toString() {
        return super.toString() + " ➤ I am toString()";
    }

    // Overrides getMessage() — returns a custom message for the exception
    @Override
    public String getMessage() {
        return "Custom message: You entered a value less than 99 ❌ ➤ I am getMessage()";
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Checking condition — if a < 99, throw custom exception
        if (a < 99) {
            try {
                throw new MyException();  // Throwing custom exception
            } catch (MyException e) {
                System.out.println("➡️ Exception occurred!");
                System.out.println("e.getMessage(): " + e.getMessage());  // Prints custom message
                System.out.println("e.toString(): " + e.toString());      // Prints full exception with class name
                System.out.print("e.printStackTrace(): ");
                e.printStackTrace();                                      // Prints full error stack
            }
        } else {
            System.out.println("✅ Input is valid. No exception thrown.");
        }

        sc.close();
    }
}
/*

we can write the our own custom exception using the exception class in java
syntax -> class MyException extends Exception{
    //code here  overriden
}

The exception class has following important method
String toString() -> executed when a sout(e) is run
void print StockTrace() -> print the stack trace
String getMessage() ->print the exception method

📝 Summary
	•	✅ Custom Exceptions allow you to define your own error types in Java.
	•	📦 This example defines a class MyException extending the built-in Exception class.
	•	🧠 Two important methods are overridden:
	•	toString() → returns full exception object in string format (used with System.out.println(e)).
	•	getMessage() → returns a custom message (used with e.getMessage()).
	•	🚨 If input is less than 99, a MyException is thrown and caught.
	•	📄 It demonstrates how to handle custom messages, display trace logs, and keep exception handling clean.

⸻

 */
