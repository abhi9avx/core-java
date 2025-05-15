package com.company.OopsConcept;

// Base class (Parent/Superclass)
class Base {
    private int x;

    public void printMe() {
        System.out.println("I am a method in the Base class.");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Setting value of x in Base class");
        this.x = x;
    }
}

// Derived class (Child/Subclass) inheriting from Base
class Derived extends Base {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Setting value of y in Derived class");
        this.y = y;
    }
}

// Main class to test inheritance
public class InheritanceLearning {
    public static void main(String[] args) {

        // Creating object of Base class
        Base baseObj = new Base();
        baseObj.setX(10);
        System.out.println("Value of x (Base): " + baseObj.getX());

        // Creating object of Derived class
        Derived derivedObj = new Derived();
        derivedObj.setY(20);
        System.out.println("Value of y (Derived): " + derivedObj.getY());

        // Accessing inherited methods from Base class
        derivedObj.setX(50);
        System.out.println("Value of x (Inherited in Derived): " + derivedObj.getX());
    }
}


/* 📚 Summary: Inheritance in Java

🔹 What is Inheritance?
Inheritance allows one class (child) to acquire properties and behaviors (methods) of another class (parent).

🔹 Key Concepts:
	•	extends keyword is used to inherit from a class.
	•	Parent class = Superclass
	•	Child class = Subclass
	•	Reusability of code is a major benefit.
	•	Child class can access public and protected members of the parent.
	•	Java does not support multiple inheritance with classes (only with interfaces).

🔹 Syntax Example: class Animal {
    void sound() { }
}

class Dog extends Animal {
    void bark() { }
}

🔹 Notes:
	•	Constructors are not inherited, but can be called using super().
	•	Always use access modifiers like private and public properly to encapsulate data.
 */
