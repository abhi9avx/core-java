package com.company.OppsConcept;

// 🔹 Interface: A group of related abstract methods.
// All methods in an interface are public and abstract by default.
// All variables are public, static, and final (constants).

interface Bicycle {
    int a = 45; // Constant (public static final)

    void applyBrake(int decrement); // Abstract method
    void speedUp(int increment);    // Abstract method
}

interface HornBicycle {
    void blowHornK3G();  // Abstract method
    void blowHornY5T();  // Abstract method
}

// 🔹 Concrete class implementing multiple interfaces
class AvonCycle implements Bicycle, HornBicycle {

    // This is a normal method specific to this class
    void blowHorn() {
        System.out.println("Pee pee poo poo");
    }

    // Implementing Bicycle interface methods
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Brake applied: Decreased speed by " + decrement);
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speed increased by " + increment);
    }

    // Implementing HornBicycle interface methods
    @Override
    public void blowHornK3G() {
        System.out.println("Horn Sound: Kabhi Khushi Kabhi Gham 🎵");
    }

    @Override
    public void blowHornY5T() {
        System.out.println("Horn Sound: Main Hoon Na 🎶");
    }
}

// 🔹 Main class to test implementation
public class InterfaceLearning {
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle();

        // Using Bicycle methods
        myCycle.applyBrake(2);
        myCycle.speedUp(5);

        // Accessing variable from interface
        System.out.println("Interface variable a: " + myCycle.a); // Allowed: variable is public static final

        // ❌ Not allowed: final variable cannot be reassigned
        // myCycle.a = 87;

        // Using HornBicycle methods
        myCycle.blowHornK3G();
        myCycle.blowHornY5T();

        // Using custom method from class (not part of interface)
        myCycle.blowHorn();
    }
}


/*
📘 SUMMARY – INTERFACE IN JAVA

🔹 What is an Interface?
- Group of abstract methods (no body).
- Used when you want to define a contract/template for classes to follow.
- Variables are implicitly: public, static, and final.
- Methods are implicitly: public and abstract (till Java 7).
- Java supports **multiple interface implementation**, unlike abstract classes.

🔹 Why Interface?
- When you need **multiple templates/behaviors** in one class.
- Java does **not support multiple inheritance** with classes, but interfaces solve this problem.

🔹 Key Points:
1. Interface cannot have constructors.
2. Interface methods must be implemented in concrete class.
3. A class can `implement` multiple interfaces.
4. Interface variables cannot be changed after assignment.
5. Objects of interfaces cannot be created, but references can be used.

🔸 Real-World Analogy:
Think of an interface as a **remote control**. Buttons are defined (method signatures),
but the actual implementation depends on the device (class) – TV, AC, etc.

🧠 Example:
interface RemoteControl { void powerOn(); void powerOff(); }
class TV implements RemoteControl → TV defines how powerOn() works.

*/

/*

Abstract class -> ek tho abstract method hoga hi , and non abstract method bhi ho sakte hai
Interface ->  english -> tw point where two system meet and interact.
Tv <----> Human (Remote , Buttons)

In java Interface means  GROUP OF RELATED METHOD WITH EMPTY BODIES
Phone -< camera , mp3 player , calling ., web browser , microphone ,


interface Bicycle {
void appleBrake(int decrement) ;
void speedUp (int increment);
}

class AvonCycle implements Bicycle {
int speed = 7 ;
void applyBrake (int decrement) {
speed = speed - decrement ;}
void speedUp(int increment){
speed = speed + increment; }




interface ke object nhi ban sakte hai
interface ka reference ban sakte hai -> haa
interface ke ander -> saare abstract hote hai , koi non abstrqct method nhi ho sakte hai


Abstract class vs interfaces
we cant extend multiple abstract classes but we can implement multiple interfaces at a time.


Sure Abhinav! Here’s your explanation rewritten in a clean, professional, and Hinglish-friendly way, with clear formatting and technical correctness — perfect for interview prep, notes, or even content creation.

⸻

✅ Abstract Class vs Interface – Clear Explanation

⸻

🔷 Abstract Class
	•	Ek abstract class mein kam se kam ek abstract method hota hi hai.
	•	Lekin usme non-abstract (concrete) methods bhi ho sakte hain.
	•	Iska purpose hota hai ki dusri classes isse inherit karke methods ko implement karein.
	•	Abstract class ka object nahi ban sakta, but constructor ho sakta hai.

🧾 Example:

abstract class Animal {
    // Abstract method (without body)
    abstract void sound();

    // Non-abstract method (with body)
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}


⸻

🔷 Interface
	•	English meaning: “A point where two systems meet and interact”
	•	Jaise: TV <–> Human (interaction via remote, buttons, etc.)
	•	Java mein, interface ek group hota hai related abstract methods ka — jinke body nahi hote (Java 7 tak).
	•	Interface = 100% abstraction (Java 8 ke baad default and static methods bhi aa gaye).

🧾 Example:

interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    int speed = 7;

    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Speed after brake: " + speed);
    }

    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Speed after speeding up: " + speed);
    }
}


⸻

🔍 Interface Related Points:

✅ Interface ka object nahi ban sakta
✅ Reference ban sakta hai
✅ Saare methods by default abstract hote hain
❌ Interface ke andar non-abstract methods allowed nahi (Java 7 tak)

⸻

⚖️ Abstract Class vs Interface

Feature	Abstract Class	Interface
Methods	Abstract + Non-abstract	Only abstract (till Java 7)
Object Creation	❌ Not allowed	❌ Not allowed
Constructor	✅ Yes	❌ No
Variable Types	Instance variables allowed	Only public static final (constants)
Multiple Inheritance	❌ Not supported	✅ Supported (implements multiple)
Access Modifiers	public, protected, private	Only public (methods are public by default)
Use-case	Base class with partial implementation	Contract-based design, 100% abstraction


⸻

🎯 Real-World Analogy
	•	Abstract Class → Blueprint of a machine → kuch kaam already defined hote hain, kuch tum define karte ho
	•	Interface → Remote control → Sirf button define hain, har company uske piche ka system alag tarike se implement karti hai

⸻

 */