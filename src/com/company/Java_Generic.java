package com.company;

import java.util.ArrayList;

public class Java_Generic {
    public static void main(String[] args) {

        // ❌ Non-generic ArrayList - allows any type of element
        ArrayList arrayList = new ArrayList();

        arrayList.add("String1");  // Adding String
        arrayList.add(45);         // Adding Integer
        arrayList.add(2345);       // Adding another Integer

        // ❌ Typecasting required
        int a = (int) arrayList.get(1);  // Must cast because it's an Object
        System.out.println(a);           // Output: 45
    }
}

/*
import java.util.ArrayList;

public class Java_Generic {
    public static void main(String[] args) {

        // ✅ Generic ArrayList - only allows Integer values
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(2345);
        numbers.add(12);

        // No need for typecasting
        int a = numbers.get(1);   // Automatically treated as int
        System.out.println(a);    // Output: 2345
    }
}

✅ Summary:
	•	Use Generics to avoid runtime errors and typecasting.
	•	It helps in writing safer code.
	•	ArrayList<Integer> means the list can only hold integers — if you try to add a string, you’ll get a compile-time error, not a runtime one.

	⚠️ Problem:
	•	ArrayList stores items as Object, so when retrieving values like int, we must cast.
	•	If you mistakenly cast a String to int, it will throw a ClassCastException at runtime.
 */