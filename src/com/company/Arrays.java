package com.company;

/**
 * 📚 Java Arrays – Basics
 *
 * 🔸 Arrays are used to store multiple values of the same type in a single variable.
 * 🔸 They are fixed in size (length defined at creation).
 * 🔸 Array indexing starts from 0.
 *
 * ✅ Two main ways to create an array:
 *   1. Declaration with size: `int[] arr = new int[5];`
 *   2. Declaration with values: `int[] arr = {1, 2, 3};`
 *
 * 📌 Key Concepts:
 *   - `arr.length` → gets total number of elements
 *   - Indexing → `arr[0]`, `arr[1]`, etc.
 *   - Default values for int array → 0
 *   - Can be used with loops (`for`, `for-each`)
 */

public class Arrays {
    public static void main(String[] args) {
        // 🔹 Method 1: Creating an array with fixed size
        int[] marks = new int[5]; // Size = 5, default values = 0

        // Assigning values to specific indexes
        marks[0] = 100;
        marks[2] = 64;
        marks[3] = 56;

        // 🔸 Looping through the array using for loop
        System.out.println("🎯 Marks array output:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + ": " + marks[i]);  // uninitialized values = 0
        }

        // 🔹 Method 2: Declare & initialize in one line
        int[] age = {34, 45, 67};  // length = 3, values set directly

        System.out.println("\n🎯 Age array output:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Age " + i + ": " + age[i]);
        }
    }
}