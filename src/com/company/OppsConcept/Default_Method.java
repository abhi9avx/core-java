package com.company.OppsConcept;

// 🎥 Interface defining camera functionalities
interface MyCamera {

    // Abstract methods: must be implemented by any class that implements this interface
    void takeSnap();
    void recordVideo();

    // 🔐 Private method: available only within this interface (since Java 9)
    private void greet4() {
        System.out.println("Good Noon 🌞");
    }

    // ✅ Default method: has a body, can be inherited without overriding
    default void record4k() {
        greet4(); // Calling private method inside default
        System.out.println("Recording in 4K 🎥");
    }
}

// 📶 Interface defining WiFi-related features
interface MyWifi {
    String[] getNetwork();                    // Abstract method
    void connectToNetwork(String network);   // Abstract method
}

// 📞 Normal cellphone class
class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("📞 Calling: " + phoneNumber);
    }

    void pickCall() {
        System.out.println("📲 Picking up the call...");
    }
}

// 📱 SmartPhone class that combines all features: phone + camera + wifi
class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {

    // Overriding camera features
    public void takeSnap() {
        System.out.println("📸 Taking a snapshot");
    }

    public void recordVideo() {
        System.out.println("🎥 Recording normal video...");
    }

    // Overriding WiFi features
    public String[] getNetwork() {
        System.out.println("📡 Getting list of available networks...");
        String[] networkList = {"2G", "3G", "4G", "5G"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("🔗 Connecting to: " + network);
    }
}

// 🚀 Driver class to run the example
public class Default_Method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();

        // ✅ Calling default method from interface
        ms.record4k();

        // ❌ ms.greet4(); // Not allowed: greet4() is private in the interface

        // ✅ Fetching and displaying network list
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println("📶 " + item);
        }
    }
}


/*
An interface can have static and default methods default mehods enables us to enable us to add new functionality to existimg interface
🧩 Why Use private Method Inside Interface?
	•	Sometimes you want to reuse logic inside multiple default methods.
	•	But you don’t want to expose that helper method to implementing classes.
	•	That’s when private method inside interface helps (used only within the interface).

	•	Interface: Socho yeh ek remote ka design hai. Har TV company (class) ko usi design ko follow karna padega.
	•	Default Method: Jaise ki company ne naya button add kiya “Netflix button” — ab purani TVs bhi bina code change ke yeh button use kar sakti hain.
	•	Private Method: Remote ke andar ek chip jo multiple buttons use karte hain — but wo chip end user ko dikhayi nahi deti.

		•	Q: Can you call a private method from outside the interface?
A: ❌ No, private methods are accessible only within the interface.
	•	Q: Can interfaces have state (variables)?
A: Only public static final constants. No mutable state.
	•	Q: Why are default methods introduced?
A: To allow interface evolution without breaking existing code.
 */