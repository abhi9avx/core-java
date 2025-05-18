package com.company.ErrorException;

/**
 * Demonstrates how try-catch is used to handle exceptions in Java.
 * Specifically, this handles ArithmeticException (division by zero).
 */
public class Try_Catch_Learning {
    public static void main(String[] args) {
        int a = 800;
        int b = 0;

        try {
            // 🚫 This line will throw an ArithmeticException (division by zero)
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            // ✅ This block catches the exception and prevents the program from crashing
            System.out.println("⚠️ Cannot divide by zero.");
            System.out.println("Error Details: " + e);
        }

        // ✅ This line will still be executed because we handled the exception above
        System.out.println("✅ End of program.");
    }
}

/*
✅ With try-catch:

Using try-catch ensures:
	•	Your program doesn’t crash.
	•	You can show a user-friendly error message.
	•	You can log or debug the error using e.printStackTrace() or System.out.println(e).

⸻

🔍 Without try-catch:

If you write this without the try-catch block:
int c = a / b;  // ← Throws ArithmeticException
System.out.println("End of program.");  // ❌ This line will never run
👉 The program crashes as soon as it encounters the exception, and any code after that line is not executed.
 */