package com.company.OopsConcept;

/**
 * Demonstrates use of `this` keyword in constructor and method.
 */
class EkClass {

    private int a; // instance variable

    // Constructor using `this` keyword to resolve shadowing
    EkClass(int a) {
        this.a = a; // 'this.a' refers to instance variable; 'a' is constructor parameter
    }

    // Getter method for 'a'
    public int getA() {
        return a;
    }

    // Method returning a fixed value
    public int returnOne() {
        return 1;
    }
}

/**
 * DoClass extends EkClass and demonstrates use of `super` to invoke parent constructor.
 */
class DoClass extends EkClass {

    // Constructor calling parent constructor using `super`
    DoClass(int c) {
        super(c); // Calls EkClass(int a)
        System.out.println("DoClass: I am a constructor in the child class.");
    }
}

/**
 * Main class to test the behavior of `this` and `super`
 */
public class This_Super_class {

    public static void main(String[] args) {
        // Creating an object of EkClass
        EkClass e = new EkClass(5);

        // Accessing value using getter
        System.out.println("Value of a from EkClass: " + e.getA());

        // Calling method that returns 1
        System.out.println("Return from returnOne(): " + e.returnOne());

        // Creating an object of DoClass
        DoClass d = new DoClass(6);

        // Getting value set in parent class through child object
        System.out.println("Value of a from DoClass (inherited): " + d.getA());
    }
}
/*
 📘 The `this` Keyword in Java:

 🔹 Definition:
 The `this` keyword refers to the **current object** — the object whose method or constructor is being executed.

 🔹 Common Use Cases:
 1. this.a = a;
    👉 Resolves conflict when parameter name is same as instance variable.
 2. this();
    👉 Calls another constructor in the same class (constructor chaining).
 3. this.methodName();
    👉 Invokes a method from the current object.
 4. return this;
    👉 Returns the current object (useful in builder patterns or method chaining).
 5. someMethod(this);
    👉 Passes current object as argument to another method.

 ✅ Use `this` when you want to access current class instance members clearly.


 📘 The `super` Keyword in Java:

 🔹 Definition:
 The `super` keyword refers to the **immediate parent class** object.

 🔹 Common Use Cases:
 1. super();
    👉 Calls the constructor of the parent class.
 2. super.variable;
    👉 Accesses parent class’s instance variable.
 3. super.method();
    👉 Calls a method of the parent class.

 ✅ Use `super` to invoke or refer to parent class functionality when it's overridden or shadowed.

 🔄 Constructor Chaining in Inheritance:
 - When an object of a child class is created:
   🔹 Java first executes the parent class constructor (via `super()` — either implicitly or explicitly).
   🔹 Then it runs the child class constructor.
   🔹 This ensures the parent part of the object is properly initialized.

 🧬 Example Execution Flow:
     EkClass(int) → DoClass(int)

 🎯 This helps avoid code duplication, promotes reuse, and builds a strong foundation for inheritance in OOP.


 */