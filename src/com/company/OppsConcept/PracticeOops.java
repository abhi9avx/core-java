package com.company.OppsConcept;

// ✅ Class representing an Employee
class Employee2 {
    int salary;
    String name;

    // Getter method to return salary
    public int getSalary() {
        return salary;
    }

    // Getter method to return name
    public String getName() {
        return name;
    }

    // Setter method to set name
    public void setName(String n) {
        name = n;
    }
}

// ✅ Class representing a CellPhone with basic functionalities
class CellPhone {
    public void ringing() {
        System.out.println("📞 Ringing...");
    }

    public void vibrating() {
        System.out.println("📳 Vibrating...");
    }

    public void callFriend() {
        System.out.println("📲 Calling Abhinav...");
    }
}

// ✅ Class to calculate area and perimeter of a square
class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

// ✅ Class representing a game character Tommy
class Tommy {
    public void hit() {
        System.out.println("👊 Hitting the enemy!");
    }

    public void run() {
        System.out.println("🏃‍♂️ Running from the enemy!");
    }

    public void firing() {
        System.out.println("🔫 Firing at the enemy!");
    }
}

// ✅ Main class to demonstrate OOPS concepts using simple problems
public class PracticeOops {

    public static void main(String[] args) {

        // 🔹 Problem 1: Using Employee2 class
        Employee2 abhinav = new Employee2();
        abhinav.salary = 234;
        abhinav.setName("Code with Abhinav");
        System.out.println("👤 Name: " + abhinav.getName());
        System.out.println("💰 Salary: " + abhinav.getSalary());

        // 🔹 Problem 2: Using CellPhone class
        CellPhone poco = new CellPhone();
        poco.ringing();
        poco.vibrating();
        poco.callFriend();

        // 🔹 Problem 3: Using Square class
        Square sq = new Square();
        sq.side = 5;
        System.out.println("📐 Area of square: " + sq.area());
        System.out.println("📏 Perimeter of square: " + sq.perimeter());

        // 🔹 Problem 4: Using Tommy class (Game character)
        Tommy tm = new Tommy();
        tm.hit();
        tm.firing();
        tm.run();
    }
}

/*
🔍 Summary: Practice OOPS with Real-World Inspired Examples

1. 👨‍💼 Employee2 class
   - Demonstrates how to use setters and getters (Encapsulation).
   - We set the name using `setName()` and retrieve it using `getName()`.

2. 📱 CellPhone class
   - Simulates real-world phone behaviors like ringing, vibrating, and calling.
   - Shows how methods define actions in a class.

3. 🔲 Square class
   - Simple class to calculate area and perimeter.
   - Demonstrates how logic is encapsulated inside methods.

4. 🕹️ Tommy class (game character)
   - Represents a game entity with actions like hit, run, and fire.
   - Demonstrates how objects can represent behaviors in games.

💡 This program is a great example to understand how classes, objects, methods, and encapsulation work in Java using Object-Oriented Programming principles.
*/