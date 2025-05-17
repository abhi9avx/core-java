package com.company.OppsConcept;

// 🎯 Base interface with two abstract methods
interface SampleInterface {
    void meth1();
    void meth2();
}

// 🧩 Extended interface inheriting from SampleInterface
// An interface can extend another interface using 'extends'
interface ChildSampleInterface extends SampleInterface {
    void meth3();
    void meth4();
}

// ✅ Concrete class that implements the child interface
// It must provide implementations for ALL methods from both interfaces
class MySampleClass implements ChildSampleInterface {

    public void meth1() {
        System.out.println("Method 1 executed ✅");
    }

    public void meth2() {
        System.out.println("Method 2 executed ✅");
    }

    public void meth3() {
        System.out.println("Method 3 executed ✅");
    }

    public void meth4() {
        System.out.println("Method 4 executed ✅");
    }
}

// 🚀 Main class to run the program
public class Inheritence_interface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();

        // Call all implemented methods
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}


/*
class se implement kr sate hai
interface to interface hum extend kr sakte hai
Rembember that interdface cannot implement another interface only classes ca do that

✅ Key Concepts Covered:
	1.	Interface-to-Interface Inheritance (extends):
	•	An interface can extend another interface.
	•	The child interface inherits all methods of the parent interface.
	2.	Class-to-Interface Implementation (implements):
	•	A class can implement one or more interfaces.
	•	When a class implements an interface, it must provide the implementation for all inherited abstract methods.

	Socho:
	•	SampleInterface ek basic blueprint hai (jaise Remote ke liye buttons: ON/OFF).
	•	ChildSampleInterface usi Remote ka advanced version hai (extra buttons: Volume, Netflix).
	•	MySampleClass us remote ka actual implementation hai — jisme har button ka proper kaam likha gaya hai.

	Concept
Description
Interface to Interface (extends)
Allowed ✅ (like inheritance in classes)
Interface implementing another interface
❌ Not allowed (only classes can implement interfaces)
Class implementing an interface
Must implement all abstract methods from that interface and its parent

 */