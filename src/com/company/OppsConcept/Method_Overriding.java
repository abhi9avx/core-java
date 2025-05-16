package com.company.OopsConcept;

// Parent class A
class A {

    // Method defined in class A
    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

// Child class B extending class A
class B extends A {

    // Overriding meth2() from class A
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    // New method in class B
    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

// Main class to demonstrate method overriding
public class Method_Overriding {
    public static void main(String[] args) {

        // Creating object of class A
        A a = new A();
        a.meth2();  // Calls A's meth2()

        // Creating object of class B
        B b = new B();
        b.meth3();  // Calls B's meth3()
        a.meth2();  // Calls A's meth2()
        b.meth2();  // Calls overridden meth2() from B
    }
}

/*
------------------------------
✨ Summary & Key Points:
------------------------------

✅ Method Overriding:
   - When a child class provides its own implementation of a method already defined in the parent class.
   - Must have the **same method name, return type, and parameters**.

✅ @Override Annotation:
   - Helps to ensure you are actually overriding a method.
   - Gives a compile-time error if the method is not correctly overridden.

✅ Polymorphism in action:
   - Even though the method is defined in both parent and child,
     the method in the child class gets called when using a child class object.

❗ Note:
   - This is **Method Overriding**, NOT Method Overloading.
   - Method Overloading = Same method name with different parameters (in same class).

📌 Real-life Use Case:
   - Used when you want to define specific behavior in subclass while still inheriting from a base class.
*/