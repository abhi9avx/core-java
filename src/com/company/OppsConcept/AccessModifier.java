package com.company.OppsConcept;

/*
🔒 Access Modifiers in Java:
Access modifiers define the scope or visibility of variables and methods in a class.

There are 4 types:
1. private     -> Accessible only within the same class.
2. default     -> Accessible within the same package.
3. protected   -> Accessible within the same package and subclasses.
4. public      -> Accessible from everywhere.

✅ This example demonstrates how to use `private` access modifier with getters and setters (Encapsulation).
*/

class MyEmployee {
    // 🔐 Private attributes - can't be accessed directly outside this class
    private int id;
    private String name;

    // ✅ Getter for name
    public String getName() {
        return name;
    }

    // ✅ Setter for name
    public void setName(String n) {
        name = n;
    }

    // ✅ Getter for id
    public int getId() {
        return id;
    }

    // ✅ Setter for id
    public void setId(int i) {
        id = i;
    }
}

public class AccessModifier {
    public static void main(String[] args) {

        // 🧑‍💼 Creating a new employee object
        MyEmployee abhinav = new MyEmployee();

        // ❌ Direct access not allowed due to `private` modifier
        // abhinav.id = 89;  --> ❌ Error
        // abhinav.name = "Code with Abhinav";  --> ❌ Error

        // ✅ Using setter methods to assign values
        abhinav.setId(1234);
        abhinav.setName("Code WITH ME");

        // ✅ Using getter methods to retrieve values
        System.out.println("🆔 Employee ID: " + abhinav.getId());
        System.out.println("👤 Employee Name: " + abhinav.getName());
    }
}

/*
📝 Summary:
- `private` access modifier is used to restrict direct access to class members.
- We use **getter** and **setter** methods to access and modify those private fields.
- This practice promotes **Encapsulation** (data hiding), a core concept in OOP.

💡 Tip: Always use private fields with public getters/setters to control access and maintain encapsulation.
*/