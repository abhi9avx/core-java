package com.company.ErrorException;

import java.util.Scanner;

/**
 * This class demonstrates two types of errors:
 * 1. Logical Error
 * 2. Run-Time Error (Exception)
 */
public class ErrorDemo {
    public static void main(String[] args) {

        // 🔍 Logical Error Demo
        // Goal: Print all prime numbers between 1 and 10
        // Expected Output: 2, 3, 5, 7

        System.out.println("Prime numbers between 1 and 10:");

        // ❌ Incorrect logic: This prints 2, 3, 5, 7, 9
        // 9 is not a prime number → This is a logical error
        System.out.println(2);  // 2 is a prime

        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // ✅ Note: The above loop doesn't actually check for primality.
        // It just prints odd numbers which may include non-primes (like 9).
        // This shows how logic can be correct syntactically but wrong in purpose.

        System.out.println(); // Just to separate output sections


        // ⚠️ Run-Time Error Demo (Exception)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to divide 1000 by: ");
        int k = sc.nextInt();

        // ❌ Possible Run-Time Error: Division by zero
        // If user enters 0 → java.lang.ArithmeticException: / by zero
        System.out.println("Integer part of 1000 divided by " + k + " is: " + (1000 / k));

        sc.close(); // Always good to close the scanner
    }
}

/*

🔍 Key Concepts Covered:
	•	Logical Error: Code runs fine but gives incorrect result.
	•	Run-Time Error (Exception): Program crashes during execution due to invalid input (like division by zero).

⸻


Corrected code without the logic error
package com.company.ErrorException;

 * This program prints all prime numbers between 1 and 10.

public class PrimeNumberDemo {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 10:");

        for (int num = 2; num <= 10; num++) {
            boolean isPrime = true;

            // Check if 'num' is divisible by any number from 2 to num-1
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
 */