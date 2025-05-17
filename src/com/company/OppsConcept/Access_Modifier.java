package com.company.OopsConcept;

// Class demonstrating access modifiers
class C1 {
    public int x = 6;         // Accessible from anywhere
    protected int y = 89;     // Accessible within the same package and in subclasses
    int z = 98;               // Default (package-private) - accessible only within the same package
    private int a = 890;      // Accessible only within this class

    // Method to print all variables from within the same class
    public void meth1() {
        System.out.println("Inside C1.meth1():");
        System.out.println("public x = " + x);
        System.out.println("protected y = " + y);
        System.out.println("default z = " + z);
        System.out.println("private a = " + a);
    }
}

public class Access_Modifier {
    public static void main(String[] args) {
        C1 c = new C1();

        // Accessing method and fields from the same package
        c.meth1();  // Works: All fields accessed within the class

        System.out.println("\nAccessing fields from main():");
        System.out.println("public x = " + c.x);    // Accessible
        System.out.println("protected y = " + c.y); // Accessible (same package)
        System.out.println("default z = " + c.z);   // Accessible (same package)
        // System.out.println("private a = " + c.a); // Error: private variable not accessible outside class
    }
}

/*

🔍 Key Points:
	•	private: Strictly within the class.
	•	default (no modifier): Within the package.
	•	protected: Within the package + subclasses.
	•	public: Accessible from everywhere.


Access modifier determine whether other clas can use a particular fields or invoke a particular method
can be public , protected , or default

Access Levels
Modifier	Class	Package	Subclass	World
public	      Y	       Y	  Y	        Y
protected	  Y	       Y	  Y	        N
no modifier	  Y	       Y	  N	         N   //Default
private	      Y	       N	  N	         N

 */