package com.company.OppsConcept;

// 👨‍💼 Custom Employee Class with Constructor Overloading and Access Modifiers
class MyMainEmployee {
    // 🔐 Private properties (Encapsulation)
    private int id;
    private String name;

    // 🧱 Default Constructor (No Parameters)
    // This constructor initializes default values when no input is given
    public MyMainEmployee() {
        id = 78;
        name = "Abhinav Bhai";
    }

    // 🧱 Parameterized Constructor
    // Allows initializing the object with custom name and ID
    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    // ✅ Getter for name
    public String getName() {
        return name;
    }

    // ✅ Setter for name
    public void setName(String n) {
        this.name = n;
    }

    // ✅ Getter for id
    public int getId() {
        return id;
    }

    // ✅ Setter for id
    public void setId(int i) {
        this.id = i;
    }
}

public class ConstructorTutorial {

    public static void main(String[] args) {

        // ✅ Creating object using Default Constructor
        MyMainEmployee abhinav = new MyMainEmployee();
        //abhinav.setId(123); // Setter (optional if using parameterized constructor)
        //abhinav.setName("Abhinav Kumar");
        System.out.println("Using Default Constructor:");
        System.out.println("Employee ID: " + abhinav.getId());
        System.out.println("Employee Name: " + abhinav.getName());

        System.out.println("--------------------------------");

        // ✅ Creating object using Parameterized Constructor
        MyMainEmployee abhinav2 = new MyMainEmployee("Test with Me", 124);
        System.out.println("Using Parameterized Constructor:");
        System.out.println("Employee ID: " + abhinav2.getId());
        System.out.println("Employee Name: " + abhinav2.getName());
    }
}

/*
📚 SUMMARY: Constructor in Java

-> Constructor is a special method that is automatically called when an object is created.
-> It is used to initialize the object’s properties.
-> Constructor name must be the SAME as the class name.
-> It does NOT have a return type (not even void).

🧱 Types of Constructors:
1. Default Constructor:
   - No parameters.
   - Used when you want to assign some default values.

2. Parameterized Constructor:
   - Accepts parameters.
   - Used when you want to initialize object with custom values.

🌀 Constructor Overloading:
-> Java allows multiple constructors with different parameters (method overloading concept).
-> Helps in creating objects in different ways.

🧠 Key Concepts:
- Encapsulation: Using private variables with public getters and setters.
- Clean code and object initialization using constructors improves readability and maintainability.

🧪 Example:
    MyMainEmployee emp1 = new MyMainEmployee(); // default constructor
    MyMainEmployee emp2 = new MyMainEmployee("Abhinav", 101); // parameterized constructor
*/