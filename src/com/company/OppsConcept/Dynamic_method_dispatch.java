package com.company.OopsConcept;

// Parent class: Phone
class Phone {
    public void name() {
        System.out.println("My name is Java in class 1");
    }

    public void greet() {
        System.out.println("Good Morning");
    }
}

// Child class: SmartPhone extends Phone
class SmartPhone extends Phone {

    // Overriding the name() method from Phone
    @Override
    public void name() {
        System.out.println("My name is Java in class 2");
    }

    // A method specific to SmartPhone
    public void swagat() {
        System.out.println("Aapka Swagat hai");
    }
}

// Main class to demonstrate Dynamic Method Dispatch
public class Dynamic_method_dispatch {
    public static void main(String[] args) {

        // Case 1: Creating object of parent class - Allowed
        Phone obj = new Phone();
        obj.name();  // Calls Phone's name()

        // Case 2: Creating object of child class - Allowed
        SmartPhone smobj = new SmartPhone();

        // Case 3: Parent class reference -> Child class object - Allowed
        Phone obj2 = new SmartPhone();  // ✅ Upcasting (Allowed)

        // Case 4: Child class reference -> Parent class object - Not Allowed
        // SmartPhone obj3 = new Phone();  ❌ Compilation error (Downcasting not implicitly allowed)

        obj2.greet();   // Calls greet() from Phone (not overridden)
        obj2.name();    // Calls overridden name() from SmartPhone
        // obj2.swagat(); // ❌ Not allowed - reference type is Phone (compile-time restriction)
    }
}

/*
-----------------------------------
✨ Summary & Key Concepts:
-----------------------------------

✅ Dynamic Method Dispatch (Run-time Polymorphism):
   - Refers to the process where a **parent class reference** is used to **refer to a child class object**.
   - The method call is resolved at **runtime** based on the object type, not reference type.

✅ Rules:
   - Allowed: `Phone obj = new SmartPhone();`  → ✅ (Upcasting)
   - Not Allowed: `SmartPhone obj = new Phone();` → ❌ (Downcasting needs explicit cast and is unsafe)

✅ Method Resolution:
   - **Overridden methods**: Resolved based on **object type** (SmartPhone).
   - **Non-overridden methods**: Resolved based on **reference type** (Phone).
   - **Unique methods of child (e.g., swagat())**: Can’t be accessed via parent reference.

📌 Real-World Use Case:
   - Useful in designing systems where behavior depends on actual object type but code interacts via base class reference. Eg: Android `Context`, `Activity`, etc.

🧠 Pro Tip:
   - Always check the **type of reference** and the **type of object** while dealing with inheritance.

*/