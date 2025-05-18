package com.company;

// Parent class
class Phone {
    @Deprecated
    public void oldRingTone() {
        System.out.println("Playing old ringtone...");
    }

    public void call() {
        System.out.println("Calling from Phone...");
    }
}

// Child class
class NewPhone extends Phone {
    @Override
    public void call() {
        System.out.println("Calling from NewPhone...");
    }
}

public class Java_Annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone myPhone = new NewPhone();
        myPhone.call();              // @Override in action
        myPhone.oldRingTone();       // Using a @Deprecated method
    }
}

/*

Annotation is used to provide extra information about a program annotation provide meta-data to class/method
following are the some common annotation built in java


⸻

🔖 Annotations in Java (Explained Clearly)

Annotations in Java are used to provide extra information (metadata) about a program to the compiler and runtime. They do not directly affect program logic but help in tasks like code analysis, compilation checks, and runtime processing.

Here are some of the commonly used built-in annotations:
	1.	@Override
	•	Indicates that a method is being overridden from a superclass.
	•	Helps the compiler catch errors if the method signature doesn’t match the parent class method.
	2.	@SuppressWarnings
	•	Tells the compiler to ignore specific warnings (like unchecked type warnings or deprecation notices).
	•	Useful to clean up compiler output while still writing safe and controlled code.
	3.	@Deprecated
	•	Marks a method or class as deprecated, meaning it’s no longer recommended for use.
	•	The compiler will show a warning if the deprecated element is used elsewhere in the code.

⸻
🔍 What’s Happening Here:
	•	@Override: Used in NewPhone class to override call() method from the Phone class.
	•	@Deprecated: Marks oldRingTone() as outdated, signaling it’s not recommended for use.
	•	@SuppressWarnings("deprecation"): Hides the warning generated when calling a deprecated method in main().
	-

 */