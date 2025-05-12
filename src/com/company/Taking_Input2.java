package com.company;
import java.util.Scanner;

/**
 * 📥 Taking Input in Java using Scanner
 *
 * 🔹 Java does not have built-in input like Python (e.g., input()).
 * 🔹 We use the Scanner class from java.util package to take input from the user.
 *
 * ➤ Common Scanner Methods:
 *     - nextInt()   → for int input
 *     - nextFloat() → for float input
 *     - nextDouble() → for double input
 *     - next()      → for single word
 *     - nextLine()  → for entire line
 *
 * 💡 Tips:
 * - Always close the Scanner using `sc.close()` to avoid resource leaks.
 * - If you mix `nextLine()` after `nextInt()` or `next()`, consume the leftover newline using `sc.nextLine()` before using it again.
 * - Input mismatch (e.g., entering text instead of number) will throw `InputMismatchException`.
 */

public class Taking_Input2 {
    public static void main(String[] args) {
        System.out.println("It works");
        System.out.print("Taking input from user...\n");

        // 🛠️ Create a Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No 1:");
        int a = sc.nextInt();  // ⌨️ Takes integer input from user

        System.out.println("Enter No 2:");
        int b = sc.nextInt();  // ⌨️ Takes another integer input

        int sum = a + b;
        System.out.println("The sum of a + b is -> " + sum);  // 📤 Output result

        sc.close(); // ✅ Always close the Scanner
    }
}




    //📦 Scanner Class Methods (Java)
    //
    //The Scanner class in Java is used for reading user input from console (System.in).
    //
    //Scanner sc = new Scanner(System.in);
    //
    //
    //⸻
    //
    //🔤 1. next()
    //	•	Reads one word (till space or newline)
    //	•	Stops input at space
    //
    //String name = sc.next();  // Input: Abhinav Kumar → Output: "Abhinav"
    //
    //
    //⸻
    //
    //📄 2. nextLine()
    //	•	Reads the entire line including spaces
    //	•	Stops at newline
    //
    //String fullName = sc.nextLine();  // Input: Abhinav Kumar → Output: "Abhinav Kumar"
    //
    //⚠️ Common Issue: After using nextInt() or next(), a newline (\n) remains. Call sc.nextLine() once to clear it before using nextLine() again.
    //
    //⸻
    //
    //🔢 3. nextInt()
    //	•	Reads an integer
    //
    //int age = sc.nextInt();  // Input: 24 → OK
    //
    //
    //⸻
    //
    //🔢 4. nextFloat()
    //	•	Reads a float value
    //
    //float price = sc.nextFloat();  // Input: 45.6 → OK
    //
    //
    //⸻
    //
    //🔢 5. nextDouble()
    //	•	Reads a double-precision number
    //
    //double d = sc.nextDouble();
    //
    //
    //⸻
    //
    //🔢 6. nextLong(), nextShort(), nextByte()
    //	•	Reads respective primitive types
    //
    //⸻
    //
    //✅ Boolean Checkers (hasNextX() methods)
    //	•	Check if next input is valid before reading
    //
    //sc.hasNextInt()
    //sc.hasNextDouble()
    //sc.hasNextLine()
    //sc.hasNext()
    //
    //These return true or false depending on input type.
    //
    //⸻
    //
    //🛠️ Summary Table:
    //
    //Method	Description	Reads
    //next()	Reads a single word	String (word)
    //nextLine()	Reads entire line (with spaces)	String (line)
    //nextInt()	Reads an integer	int
    //nextFloat()	Reads a float	float
    //nextDouble()	Reads a double	double
    //hasNextInt()	Checks if next input is int	boolean
    //hasNextLine()	Checks if next line is available	boolean
