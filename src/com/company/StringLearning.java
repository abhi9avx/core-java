package com.company;

/**
 * 📚 String in Java
 *
 * 🔹 String is a class from `java.lang` package.
 * 🔹 Though it's a class, it behaves like a **primitive-like data type** (because it's used so frequently).
 * 🔹 Strings in Java are **immutable** (once created, cannot be changed).
 *
 * ✅ Ways to create a String:
 *   - `String name = "Abhinav";`      // String literal (commonly used)
 *   - `String name = new String("Abhinav");` // Creates a new String object in heap
 *
 * 🔸 `printf()` is used for formatted output
 */

public class StringLearning {
    public static void main(String[] args) {
        // String using literal (stored in string pool)
        String name = "Abhinav Kumar"; // 'name' is a reference to the string object

        // Printing the string
        System.out.println(name);

        // Formatted output using printf
        System.out.printf("My name is %s", name);
    }
}