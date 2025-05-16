package com.company.OopsConcept;

// 🔵 Parent Class: Circle
class Circle {
    protected int radius;

    // Constructor for Circle
    Circle(int radius) {
        this.radius = radius;
        System.out.println("✅ Circle parameterized constructor called.");
    }

    // Method to calculate area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }
}

// 🟡 Child Class: Cylinder extending Circle
class Cylinder extends Circle {
    private int height;

    // Constructor for Cylinder
    Cylinder(int radius, int height) {
        super(radius);  // Call the constructor of Circle
        this.height = height;
        System.out.println("✅ Cylinder parameterized constructor called.");
    }

    // Method to calculate volume of the cylinder
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// 🧪 Main class to test inheritance
public class InheritencePractice{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(12, 5);

        System.out.println("🔹 Area of Circle (base): " + cylinder.area());
        System.out.println("🔹 Volume of Cylinder: " + cylinder.volume());
    }
}


/*
📌 Summary & Key Points:

✅ Inheritance:
	•	Cylinder class inherits properties and methods from the Circle class.
	•	super(radius) is used to call the constructor of the parent class.

✅ Code Reusability:
	•	Cylinder doesn’t need to re-implement area() — it reuses it from Circle.

✅ Encapsulation & Clean Design:
	•	Proper naming (Cylinder instead of Cylinder1) and access modifiers (protected, private) used for clarity and safety.

✅ Math Logic:
	•	Circle Area: π × r²
	•	Cylinder Volume: π × r² × h
 */