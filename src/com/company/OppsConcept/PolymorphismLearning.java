package com.company.OppsConcept;

// 🎥 Interface defining camera functionalities
interface MyCamera2 {

    // Abstract methods (must be implemented by any class implementing this interface)
    void takeSnap();
    void recordVideo();

    // 🔐 Private method inside interface (Since Java 9)
    private void greet() {
        System.out.println("🌞 Good Noon from Camera!");
    }

    // ✅ Default method: provides a concrete implementation (can be used directly or overridden)
    default void record4k() {
        greet(); // Call to private method inside interface
        System.out.println("📹 Recording in 4K...");
    }
}

// 📶 Interface defining WiFi-related features
interface MyWifi2 {
    String[] getNetwork(); // Returns list of networks
    void connectToNetwork(String network); // Connects to specific network
}

// 📞 A regular class that represents basic cell phone functionalities
class MyCellPhone2 {

    void callNumber(int phoneNumber) {
        System.out.println("📞 Calling: " + phoneNumber);
    }

    void pickCall() {
        System.out.println("📲 Picking up the call...");
    }
}

// 📱 SmartPhone class that INHERITS CellPhone AND IMPLEMENTS both MyCamera2 and MyWifi2 interfaces
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {

    // Camera functionalities
    public void takeSnap() {
        System.out.println("📸 Taking a snap");
    }

    public void recordVideo() {
        System.out.println("🎥 Recording video");
    }

    // WiFi functionalities
    public String[] getNetwork() {
        System.out.println("📡 Scanning for networks...");
        String[] networks = {"2G", "3G", "4G", "5G"};
        return networks;
    }

    public void connectToNetwork(String network) {
        System.out.println("🔌 Connected to: " + network);
    }
}

// 🧪 Testing Polymorphism & Interface behavior
public class PolymorphismLearning {
    public static void main(String[] args) {

        // 👇 Reference is of interface type, object is of class type
        MyCamera2 cam1 = new MySmartPhone2();
        cam1.record4k(); // ✅ Allowed - MyCamera2 feature

        // cam1.callNumber(); ❌ Not allowed - cam1 is reference of MyCamera2 only

        System.out.println("\n📱 Using full smartphone object:");
        MySmartPhone2 smart = new MySmartPhone2();

        smart.takeSnap();
        smart.recordVideo();
        smart.record4k();
        smart.connectToNetwork("WiFi@Home");

        String[] networks = smart.getNetwork();
        System.out.println("📶 Available Networks:");
        for (String net : networks) {
            System.out.println(" - " + net);
        }
    }
}


/*

multiple form
camera -> smartphone ,
similar to dynamic method dispact in inheritence
GPS G = new Smartphone();-> can only use gps method



cellphone (INHERIT KRNA HOGA CLASS  )   GPS(IMPLEMENT)    CAMERA(IMPLEMENT)     MEDIA PLAYER(IMPLEMENTS)

         sMARTpHONE


         IMPLEMENTAING AN INTERFACE FORCES METHOD IMPLEMENTATION


📘 Real-Life Analogy
	•	Socho tumhaare paas ek Smartphone hai.
	•	Camera Interface → Tum phone ka sirf camera feature use kar rahe ho.
	•	WiFi Interface → Tum phone se WiFi connect kar rahe ho.
	•	CellPhone Class → Tum phone se call bhi kar sakte ho.
	•	Par agar reference sirf Camera ka hai, toh tum WiFi ya Call use nahi kar sakte — kyunki tum camera ke nazariye se phone ko dekh rahe ho 📷.


	•	Interfaces allow multiple inheritance in Java.
	•	Default and private methods inside interfaces allow backward compatibility and internal logic encapsulation.
	•	Use polymorphism to restrict object behavior and promote loose coupling.
	•	Always remember — interface references can only access methods declared inside the interface, not the implementing class.

	Concept
Explanation
Interface Implementation
MySmartPhone2 class implements both MyCamera2 and MyWifi2
Multiple Inheritance using Interfaces
Java doesn’t allow multiple class inheritance, but you can implement multiple interfaces to achieve similar results
Default Methods in Interface
record4k() is a default method that includes a call to a private method greet() inside the interface (Java 9+)
Polymorphism
MyCamera2 cam1 = new MySmartPhone2(); — object behaves like a camera, not like a phone or WiFi device
Interface Reference Limitation
You cannot access non-interface methods using an interface reference (e.g., cam1.callNumber() is invalid)

 */