package com.company.OppsConcept;

// Custom Class Example in Java
// --------------------------------------
// ✅ Any real-world object = Properties + Behaviours
// ✅ Object in OOPS = Attributes + Methods
// ✅ One public class per .java file allowed

// 🔹 Creating a custom class 'Employee'
class Employee {
    // Attributes (properties of the object)
    int id;          // Employee ID
    String name;// Employee name
    int salary;

    // Method (behavior of the object)
    public void printAttributes() {
        System.out.println("My Id is -> " + id);
        System.out.println("My name is -> " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("🧠 This is my custom class demo!");

        // 🔸 Creating (instantiating) Employee objects
        Employee abhinav = new Employee();  // First employee object
        Employee john = new Employee();     // Second employee object

        // 🔸 Setting properties
        abhinav.id = 10;
        abhinav.name = "Code with Abhinav";
        abhinav.salary = 12345;

        john.id = 13;
        john.name = "John Kumar";
        john.salary = 2334;

        // 🔸 Accessing and printing properties directly
        System.out.println("Abhinav's ID: " + abhinav.id);
        System.out.println("Abhinav's Name: " + abhinav.name);

        // 🔸 Using method to print details
        abhinav.printAttributes();   // Calls method on abhinav object
        john.printAttributes();// Calls method on john object
        int salary = john.getSalary();
        System.out.println(salary);
    }
}


/*
📌 Summary: Writing a Custom Class in Java

1. We define a class to represent real-world objects in code.
   Example: Employee class with `id` and `name` as attributes.

2. Each object (instance of the class) has its own values for these attributes.

3. We use methods inside the class to define behaviors.
   Example: `printAttributes()` prints the details of the employee.

🧾 Syntax:
    class ClassName {
        // attributes
        // methods
    }

🚀 Object Creation:
    ClassName obj = new ClassName(); // Instantiation

⚠️ Note: Only one public class is allowed per .java file.

This approach is the foundation of OOPS (Object-Oriented Programming),
which models real-world entities in code.
*/