package com.company;

public class Lambda_Concept {

    // Functional interface: Only one abstract method
    @FunctionalInterface
    interface MyFunctionalInterface {
        void meth1();
    }

    public static void main(String[] args) {

        // Anonymous class implementation
        MyFunctionalInterface obj1 = new MyFunctionalInterface() {
            @Override
            public void meth1() {
                System.out.println("Implemented using Anonymous Class");
            }
        };
        obj1.meth1();

        // Lambda expression implementation
        MyFunctionalInterface obj2 = () -> System.out.println("Implemented using Lambda Expression");
        obj2.meth1();
    }
}

/*
💡 Notes:
	•	@FunctionalInterface ensures that the interface only has one abstract method (required for lambda).
	•	Lambda expression syntax: () -> { code }
	•	Lambdas are concise and only work with functional interfaces.

	✅ Why is this used?
	•	Lambdas are used to reduce boilerplate code.
	•	They make it easier to pass behavior (functions) as data.
	•	Ideal when implementing Functional Interfaces (interfaces with one abstract method).

	✅ When to use Lambdas:
	•	When working with functional interfaces like:
	•	Runnable, Callable, Comparator, ActionListener, etc.
	•	When using Streams API or doing collection processing (filtering, mapping).
	•	Anywhere you want inline behavior without writing long classes.
 */