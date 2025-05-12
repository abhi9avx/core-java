package com.company;

/**
 * 📚 String Methods in Java
 *
 * 🔹 String is an immutable class used to store sequences of characters.
 * 🔹 Java provides many built-in methods for manipulating strings.
 *
 * ✅ Common String methods used:
 *   - length(), toLowerCase(), toUpperCase(), trim()
 *   - substring(), replace(), startsWith(), endsWith()
 *   - charAt(), indexOf(), equals(), equalsIgnoreCase()
 *   - Escape sequences like \" for quotes
 *
 * 🔸 Literal vs new String():
 *     - `"Abhinav"` uses String pool (memory efficient)
 *     - `new String("Abhinav")` creates a new object in heap
 */

public class StringMethods {
    public static void main(String[] args) {
        String a = "Abhinav kumar";
        String a1 = new String("Abhinav");

        // 🔹 Printing strings
        System.out.println(a);
        System.out.println(a1);

        // 🔸 Basic methods
        System.out.println(a.length());              // ➤ 13 → length of the string
        System.out.println(a.toLowerCase());         // ➤ abhinav kumar
        System.out.println(a.toUpperCase());         // ➤ ABHINAV KUMAR
        System.out.println(a.trim());                // ➤ removes leading/trailing spaces

        // 🔸 Substring
        System.out.println(a.substring(3));          // ➤ "inav kumar"
        System.out.println(a.substring(3, 5));       // ➤ "in" → from index 3 to 4

        // 🔸 Replace characters or strings
        System.out.println(a.replace('i','p'));      // ➤ Abhpnav kumar
        System.out.println(a.replace("b","wrwr"));   // ➤ Awrwrhinav kumar

        // 🔸 String checks
        System.out.println(a.startsWith("A"));       // ➤ true
        System.out.println(a.endsWith("w"));         // ➤ false

        // 🔸 Character & index methods
        System.out.println(a.charAt(1));             // ➤ 'b'
        System.out.println(a.indexOf(" "));          // ➤ 7 (index of first space)
        System.out.println(a.indexOf("a", 4));       // ➤ 9 (index of 'a' after position 4)

        // 🔸 Comparing strings
        System.out.println(a.equals("Kumar"));                   // ➤ false (case-sensitive)
        System.out.println(a.equalsIgnoreCase("Awrwrhinav kumar")); // ➤ false (ignores case)

        // 🔸 Escape characters
        System.out.println("I am Abhinav \" \" ");  // ➤ prints: I am Abhinav " "
    }
}