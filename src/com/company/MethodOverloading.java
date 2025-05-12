package com.company;

/**
 * 📘 Java: Method Overloading & Parameter Behavior
 *
 * 🔹 `void` – means the method doesn't return anything.
 * 🔹 `static` – allows calling the method without creating an object.
 * 🔹 Method Overloading – multiple methods with the same name but different parameters.
 * 🔹 Call by Value – primitive types like int do not retain changes made in the method.
 * 🔹 Call by Reference – arrays and objects retain changes because their reference is passed.
 */

public class MethodOverloading {

    // 🔹 A simple method with no parameters
    static void tellJoke() {
        System.out.println("Ya Tho Win hai, Ya Tho Lurn hai 🚀");
    }

    // 🔸 This method attempts to change a primitive int value
    static void change(int a) {
        a = a + 2; // This change won't reflect outside the method (call by value)
    }

    // 🔹 This method changes the first element of the passed array
    static void change2(int[] arr) {
        arr[0] = 45; // This will reflect outside because arrays are passed by reference
    }

    // 🔸 Method Overloading: No parameters
    static void foo() {
        System.out.println("Good morning bro 🌞");
    }

    // 🔸 Method Overloading: Single int parameter
    static void foo(int a) {
        System.out.println("Good morning " + a + " bro 🌟");
    }

    // 🔸 Method Overloading: Two int parameters
    static void foo(int a, int b) {
        System.out.println("Good evening " + a + b + " Bro! 🌃");
        // Note: a + b are concatenated as Strings if in quotes
    }

    public static void main(String[] args) {

        // 🔹 Calling a simple joke method
        tellJoke();

        // 🔹 Demonstrating array modification via method (call by reference)
        int[] marks = {10, 23, 4, 5, 6, 7};
        change2(marks);  // modifies marks[0]
        System.out.println("Array zero index value is changed to: " + marks[0]);

        // 🔸 Demonstrating primitive type (call by value)
        int x = 56;
        change(x);  // x remains unchanged
        System.out.println("x after running 'change' is still: " + x);

        // 🔹 Demonstrating method overloading
        foo();           // No parameter
        foo(3000);       // One parameter
        foo(3, 5);       // Two parameters
    }
}


//Concept
//Explanation
//Method Overloading
//Same method name, different parameters (type/number/order).
//Why Overload Methods?
//Improves readability, avoids naming confusion, supports different input types
//Cannot Overload by Return Type
//int foo() vs void foo() with same parameters won’t work—must change parameters.
//Call by Value
//Primitive values like int, float passed as copies. No change outside.
//Call by Reference
//Arrays/objects passed as reference, changes persist outside the method.