package com.company;

/**
 * 📘 Java Methods Example
 * 🔹 Demonstrates static & non-static method usage
 * 🔹 Adds logic based on condition
 */

public class MethodsInJava {

    // ✅ Static method — can be called directly from main()
    static int addLogicStatic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // ✅ Non-static method — requires object to call
    int addLogicNonStatic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 9, b = 10;
        int c = addLogicStatic(a, b);  // 🔹 Calling static method

        System.out.println("Static method result: " + c);

        // 🔸 Creating object to call non-static method
        MethodsInJava obj = new MethodsInJava();
        int result = obj.addLogicNonStatic(10, 3);
        System.out.println("Non-static method result: " + result);
    }
}

//✅ 🔍 What is a Method in Java?
//
//A method in Java is a block of code inside a class that performs a specific task. It helps in:
//	•	Code reuse (write once, use multiple times)
//	•	Improving readability and modularity
//	•	Reducing duplication and making code maintainable
//🔹 returnType – Type of value method returns (int, void, String, etc.)
//🔹 methodName – Any valid identifier (e.g., calculateSum)
//🔹 parameters – Optional inputs
//🔹 return – Statement to return a value (unless the return type is void)