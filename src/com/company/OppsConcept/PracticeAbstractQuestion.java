package com.company.OppsConcept;

// 🖊️ Problem 1: Abstract class Pen with abstract methods
abstract class Pen {
    abstract void write();   // Must be implemented by child class
    abstract void refill();  // Must be implemented by child class
}

// ✒️ Problem 2: FountainPen extends Pen and adds custom behavior
class FountainPen extends Pen {

    @Override
    void write() {
        System.out.println("✍️ Writing with fountain pen...");
    }

    @Override
    void refill() {
        System.out.println("🔄 Refilling the ink...");
    }

    void changeNib() {
        System.out.println("🛠️ Changing the nib...");
    }
}

// 🐒 Problem 3: Monkey class with jump and bite methods
class Monkey {
    void jump() {
        System.out.println("🐒 Jumping...");
    }

    void bite() {
        System.out.println("😬 Biting...");
    }
}

// 🧬 Interface BasicAnimal with basic life activities
interface BasicAnimal {
    void eat();
    void sleep();
}

// 🧑 Human class that extends Monkey and implements BasicAnimal
class Human extends Monkey implements BasicAnimal {

    void speak() {
        System.out.println("🗣️ Hello Sir!");
    }

    @Override
    public void eat() {
        System.out.println("🍽️ Eating food...");
    }

    @Override
    public void sleep() {
        System.out.println("😴 Sleeping peacefully...");
    }
}

// 🚀 Main class to test all features
public class PracticeAbstractQuestion {
    public static void main(String[] args) {

        // 🖊️ Using FountainPen
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.refill();
        pen.write();

        System.out.println("\n--- Human Activities ---");
        Human abhinav = new Human();
        abhinav.sleep();
        abhinav.eat();
        abhinav.speak();
        abhinav.jump(); // Inherited from Monkey

        System.out.println("\n--- Polymorphism Demonstration ---");

        // 👇 Using polymorphism: Human as Monkey
        Monkey monkeyRef = new Human();  // Reference is Monkey, object is Human
        monkeyRef.jump();  // Allowed
        monkeyRef.bite();  // Allowed
        // monkeyRef.speak(); ❌ Not allowed, speak() is not in Monkey

        // 👇 Using polymorphism: Human as BasicAnimal
        BasicAnimal animalRef = new Human();
        animalRef.eat();   // Allowed
        animalRef.sleep(); // Allowed
        // animalRef.jump(); ❌ Not allowed, jump() is not in BasicAnimal
    }
}


//pr1 -> create a abstract class pen with method write () and refill () as a abstract method
//problem 2 - create a class fountainPen with addition method changeNib()
//prb 3 ->create a class monkey with jump () and bite () method create a class human which inherit this monkety class and implement
//basicAnimal interface with eat () and sleep() method

/*
Concept
Explanation
Abstract Class
Pen is abstract and provides method contracts that FountainPen must implement.
Inheritance
FountainPen inherits from Pen, Human inherits from Monkey.
Interfaces
BasicAnimal defines abstract behaviors (eat() and sleep()), implemented by Human.
Polymorphism
Using parent class/interface reference (Monkey, BasicAnimal) to point to a child class (Human) object.
Method Overriding
Human overrides methods of BasicAnimal and uses inherited methods from Monkey.


	•	Pen is like a blueprint. You can’t use it directly. But you can create a real pen like FountainPen by implementing how it writes and how it refills.
	•	Monkey is like a base animal class; Human is a special monkey that can speak and also do basic animal activities like eat and sleep.
	•	Using polymorphism is like seeing someone as just a “monkey” or just a “basic animal”, even if that someone is a human. So, their abilities are limited to what’s defined in the reference type.

	✅ Key Takeaways
	•	Use abstract classes when you want to force subclasses to provide implementations.
	•	Use interfaces to define capabilities (like eat/sleep) that can be added to any class.
	•	Polymorphism helps in writing flexible, loosely-coupled code.
 */