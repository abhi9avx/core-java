package com.company.OppsConcept;

/*
 * ✅ Problem Summary:
 * 1. Create a Cylinder class with encapsulation (getters/setters for radius & height).
 * 2. Add methods to calculate surface area and volume.
 * 3. Use constructor to initialize values.
 * 4. Create a Rectangle class and overload constructor with default & custom parameters.
 */

// ✅ Class to model a Cylinder using OOP principles
class Cylinder {
    // 🔒 Private fields for encapsulation
    private int radius;
    private int height;

    // ✅ Constructor to initialize Cylinder object
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // ✅ Getter methods
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    // ✅ Setter methods
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // ✅ Method to calculate surface area of the cylinder
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // ✅ Method to calculate volume of the cylinder
    public double volumeOfCylinder() {
        return Math.PI * radius * radius * height;
    }
}

// ✅ Class to model a Rectangle
class Rectangle {
    private int length;
    private int breadth;

    // 🔁 Default constructor with fixed values (used for constructor overloading)
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // ✅ Constructor with custom parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // ✅ Getter methods
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

// ✅ Main class to test the above models
public class PracticeOpps {
    public static void main(String[] args) {

        // 🔧 Creating and modifying Cylinder object
        Cylinder myCylinder = new Cylinder(34, 45);
        myCylinder.setRadius(6);  // Overwriting with new values
        myCylinder.setHeight(15);

        // 🖨️ Display values and calculated properties
        System.out.println("Height: " + myCylinder.getHeight());
        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Surface Area: " + myCylinder.surfaceArea());
        System.out.println("Volume: " + myCylinder.volumeOfCylinder());

        // 🔧 Another Cylinder object using constructor directly
        Cylinder myCylinder2 = new Cylinder(8, 15);
        System.out.println("Height: " + myCylinder2.getHeight());
        System.out.println("Radius: " + myCylinder2.getRadius());
        System.out.println("Surface Area: " + myCylinder2.surfaceArea());
        System.out.println("Volume: " + myCylinder2.volumeOfCylinder());

        // 🔧 Rectangle object with custom constructor
        Rectangle myRectangle = new Rectangle(20, 45);
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Breadth: " + myRectangle.getBreadth());
    }
}

//Concept
//Description
//Encapsulation
//Private fields, public getters/setters
//Constructor
//Used to initialize objects
//Constructor Overloading
//Rectangle class has multiple constructors
//Object Methods
//surfaceArea(), volumeOfCylinder() show behavior
//Reusability
//Object reuse and updates through setters