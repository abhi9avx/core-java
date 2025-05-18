package com.company.ErrorException;

public class Finally_Blocks {

    // Method to demonstrate finally block behavior
    public static int greet() {
        try {
            int a = 7;
            int b = 0;
            int c = a / b;  // ❌ This will throw ArithmeticException (division by zero)
            System.out.println(c); // This line won't be executed
        } catch (Exception e) {
            System.out.println("⚠️ Exception caught in greet(): " + e);
        } finally {
            // ✅ The finally block ALWAYS executes, whether an exception occurs or not.
            System.out.println("✅ [greet()] Cleaning up resources - End of function.");
        }
        return 0;
    }

    public static void main(String[] args) {

        // 🔹 Calling greet method
        int k = greet();
        System.out.println("Returned value from greet(): " + k);

        // 🔸 Demonstrating finally inside a loop
        int a = 9;
        int b = 9;

        while (true) {
            try {
                System.out.println("Result of a/b: " + (a / b));
            } catch (Exception e) {
                System.out.println("⚠️ Exception in loop: " + e);
                break; // Breaks the loop if exception occurs
            } finally {
                // ✅ This block will run even when we break the loop
                System.out.println("🧹 [Loop] Cleaning up - final value of b is: " + b);
            }
            b--;
        }

        // 🔹 Another example with only try-finally (no catch block)
        try {
            System.out.println("Result: " + (4 / 0)); // ❌ This will throw exception
        } finally {
            // ✅ This still runs even without a catch block
            System.out.println("🧹 [Main] Cleaning up - expected error occurred.");
        }
    }
}
/*
for cleaning up the resource we have to use finally , even if we use the break ,
🧠 What is finally in Java?
	•	The finally block is used for cleanup code like closing files, releasing memory, or logging information.
	•	It always executes, even if:
	•	An exception is thrown
	•	A return statement is hit
	•	A break or continue is used inside a loop

⸻

📌 Key Takeaways:
	•	Best Practice: Use finally to clean up resources such as:
	•	File streams
	•	Network sockets
	•	Database connections
	•	Even if your program crashes, finally will execute.
 */