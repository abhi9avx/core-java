package com.company.OopsConcept;

/**
 * Base class with constructor overloading
 */
class Base1 {

    // Default constructor
    Base1() {
        System.out.println("Base1: I am the default constructor.");
    }

    // Parameterized constructor
    Base1(int a) {
        System.out.println("Base1: I am a constructor with value: " + a);
    }
}

/**
 * Derived1 class that extends Base1
 */
class Derived1 extends Base1 {

    // Default constructor
    Derived1() {
        // By default, super() is called here
        System.out.println("Derived1: I am the default constructor.");
    }

    // Parameterized constructor
    Derived1(int x, int y) {
        super(8);  // Explicitly calling Base1's parameterized constructor
        System.out.println("Derived1: I am an overloaded constructor with values: " + x + " and " + y);
    }
}

/**
 * ChildOfDerived class that extends Derived1
 */
class ChildOfDerived extends Derived1 {

    // Default constructor
    ChildOfDerived() {
        // Calls super() by default, which refers to Derived1()
        System.out.println("ChildOfDerived: I am the default constructor.");
    }

    // Parameterized constructor
    ChildOfDerived(int x, int y) {
        super(2, 5); // Calls the parameterized constructor of Derived1
        System.out.println("ChildOfDerived: I am an overloaded constructor with values: " + x + " and " + y);
    }
}

/**
 * Main class to demonstrate constructor calling order in inheritance
 */
public class ConstructorInInheritence {

    public static void main(String[] args) {
        System.out.println("----- Creating Base1 object -----");
        Base1 b = new Base1();

        System.out.println("\n----- Creating Derived1 object using default constructor -----");
        Derived1 d = new Derived1();

        System.out.println("\n----- Creating Derived1 object using parameterized constructor -----");
        Derived1 d1 = new Derived1(1, 4);

        System.out.println("\n----- Creating ChildOfDerived object using default constructor -----");
        ChildOfDerived cd = new ChildOfDerived();

        System.out.println("\n----- Creating ChildOfDerived object using parameterized constructor -----");
        ChildOfDerived cd1 = new ChildOfDerived(10, 20);
    }
}


// When a Derived class is extended from a base class the constructor of the base class is excuted first afollowed by the constructoe of the derved class .
//c1( parent ) -> c2(child) -> c3(Grand Child)
//constructor executed in top to bottom order
/*
📚 Learning and Concepts: Constructor in Inheritance

🔹 What happens during constructor chaining in inheritance?

When an object of a derived class is created:
	•	The base class constructor is called first.
	•	Then the derived class constructor is called.
	•	Then any further subclass constructors (like child of derived) are executed.

This is called constructor chaining, and it flows from top to bottom.

🔹 Rules of Constructor Execution:
	1.	Java always calls the constructor of the parent class first before executing the child’s constructor.
	2.	You can use super() to call a specific constructor of the parent class.
	3.	If no constructor is defined, Java adds a default constructor implicitly.
	4.	If a parameterized constructor is defined and not handled, it will throw a compile-time error if super() is not explicitly used.
 */