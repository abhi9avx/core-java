// Package declaration
package com.company;

// Importing required classes
import java.util.Scanner;
//import java.utils.*;

public class PackageLearning {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Reading an integer input from the user
        int a = sc.nextInt();

        // Printing the input value
        System.out.println("Value of a is: " + a);
    }
}

/*
Steps to Create and Use a Package in Java:

1. Save your file with the class name, e.g., PackageLearning.java

2. To compile and place the class inside a package folder, use:
   javac -d . PackageLearning.java
   - This creates the 'com/company' directory structure and places the compiled .class file inside it.

3. To run the compiled class, use:
   java com.company.PackageLearning

4. Notes:
   - The `-d .` option tells the compiler to create the package folder structure in the current directory.
   - You can add multiple classes to the same package by keeping the `package com.company;` line on top of each file.
*/