package com.company.OppsConcept;

// 🔹 Abstract Parent Class
abstract class Parent2 {
    // Constructor
    public Parent2() {
        System.out.println("I am the constructor of Base (Parent2)...");
    }

    // Concrete Method
    public void sayHello() {
        System.out.println("Hello");
    }

    // Abstract Methods
    abstract public void greet();
    abstract public void greet2();
}

// 🔹 Concrete Subclass (Implements all abstract methods)
class child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Night");
    }
}

// 🔹 Another Abstract Subclass (Does not implement abstract methods)
abstract class child3 extends Parent2 {
    public void th() {
        System.out.println("I am good");
    }
}

// 🔹 Main Class
public class AbstractLearning {
    public static void main(String[] args) {
        child2 c = new child2();  // Allowed: child2 is a concrete class
        c.sayHello();             // Calling concrete method from abstract class
        c.greet();                // Overridden method
        c.greet2();               // Overridden method

        // Parent2 p = new Parent2();  // ❌ Not allowed: Cannot instantiate abstract class
        // child3 c3 = new child3();   // ❌ Not allowed: child3 is abstract
    }
}

/*
📚 Abstract Classes and Methods in Java – Summary

🔸 Abstraction:
- Hiding implementation details and showing only essential features.
- Achieved using abstract classes or interfaces.

🔸 Abstract Method:
- Declared without implementation.
- Must be implemented by concrete subclass.

🔸 Abstract Class:
- Contains abstract and/or concrete methods.
- Cannot be instantiated directly.
- Can have constructors.

🔸 Key Points:
1. Abstract class = incomplete blueprint.
2. You can't create objects of abstract classes.
3. A subclass must implement all abstract methods or be declared abstract itself.
4. Abstract class can extend another abstract class.
5. Concrete class must implement all abstract methods.

🔸 Real Example:
Shape (abstract) → Circle, Rectangle (concrete classes implementing draw() differently)
*/


/*
Abstract means in english  -> existing in thought or an idea but not having a physical or concreate existence
task without executed  , implemented

Abstract Method -> A method that is declared without an implementation
syntax -> abstract void moveTo(double X , double Y) //but yeh kya krega , no one has defined or implemented


Abstract Class -> If a class includes abstract method , then class itself imust be declared abstract as in

public abstract class PhoneModel{
abstract void SwitchOff();
//more code
}


abstract class ek aise class hai jiki help se aur class banegi


abstract class ka object nhi ban sakta hai -> kyu ki wo class hai hi nhi , wo tho ek stander hai -> dusri class ka class banae ke liye


parent 2 ke jaria hai child 2 ke liye  , parent 2 bol rhi hai mere helo se child 2 class bana lo jo ki actual mai class hogi

abstract class se dusri abstract class bana sakte hai

// child 2 -> concreate class
//parent 2 , child 3 -> abstract class ( we will not able to make a object )



when an abstract class is subclassed , the sub class usually provide implementation for all the method in parent class if it doesnt it must be declared abstrct .

Example -> Shape -> circle , Rectangle , Rhombus


Note -> It is not Possible to create reference of an abstract class
it is not possible to create an object of an abstract class
 */