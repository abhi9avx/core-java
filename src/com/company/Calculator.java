package com.company;

import java.util.Scanner;

/**
 * 📊 Simple Marks Calculator
 *
 * 🔹 Takes input for 5 subjects
 * 🔹 Calculates total and percentage
 * 🔹 Uses Scanner to read user input
 *
 * 💡 Improvements:
 * - Used float for accurate percentage
 * - Clean prompts and outputs
 * - Added comments for clarity
 */

public class Calculator {
    public static void main(String[] args) {
        System.out.println("🎓 Welcome to the Marks Calculator");

        Scanner sc = new Scanner(System.in);

        // Asking for subject marks
        System.out.print("📘 Enter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("📗 Enter English marks: ");
        int english = sc.nextInt();

        System.out.print("📙 Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("📕 Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("💻 Enter Computer Science marks: ");
        int cs = sc.nextInt();

        // Calculating total and percentage
        int totalMarks = maths + english + physics + chemistry + cs;
        float percentage = totalMarks / 5.0f;  // Use float division for accuracy

        // Display results
        System.out.println("\n📈 Total Marks: " + totalMarks + "/500");
        System.out.println("📊 Percentage: " + percentage + "%");

        sc.close();  // Good practice
    }
}