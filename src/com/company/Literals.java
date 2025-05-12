package com.company;

/**
 * This class demonstrates the use of Java literals.
 *
 * 🔹 Literals are fixed values assigned to variables.
 * 🔹 Java supports different types of literals:
 *
 * 🔸 Integral Literals (whole numbers):
 *     - byte (e.g., 8-bit: -128 to 127)
 *     - short (e.g., 16-bit: -32,768 to 32,767)
 *     - int (default for integer literals, 32-bit)
 *     - long (suffix with 'L', 64-bit)
 *
 * 🔸 Floating Point Literals:
 *     - float (suffix with 'f' or 'F')
 *     - double (default for decimals, suffix with 'd' or 'D' optional)
 *
 * 🔸 Character Literals:
 *     - Single characters in single quotes (e.g., 'A')
 *
 * 🔸 Boolean Literals:
 *     - true, false
 *
 * 🔸 String Literals:
 *     - Text in double quotes (e.g., "Hello")
 */
public class Literals {
    public static void main(String[] args) {
        byte age = 34;          // Integral literal
        char ch = 'A';          // Character literal
        float f1 = 5.6f;        // Float literal
        double d1 = 4.87D;      // Double literal
        boolean a = true;       //Boolean Literal

        System.out.println("Age: " + age);
        System.out.println("Float Value: " + f1);
    }
}