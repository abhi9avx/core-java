package com.company;

// Custom thread class that extends Thread
class MyThr extends Thread {

    // Constructor that passes a custom name to the parent Thread class
    public MyThr(String name) {
        super(name); // sets the name of the thread using Thread(String name) constructor
    }

    // Task to be executed when thread starts
    @Override
    public void run() {
        int i = 0;
        while (i < 4) {
            System.out.println("I am thread");
            i++;
        }
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {

        // Create a thread and assign it a custom name "abhinav"
        MyThr t = new MyThr("abhinav");

        // Start the thread - run() will be called asynchronously
        t.start();

        // Fetch and print thread details
        System.out.println("The ID of the thread t is: " + t.getId());       // Unique thread ID
        System.out.println("The Name of the thread t is: " + t.getName());   // Custom name: "abhinav"
    }
}

/*

✅ Why Use Thread Constructor?
	•	Helps identify threads easily during debugging or logging.
	•	Useful in applications with multiple threads doing different tasks.
	•	Clean separation of thread identity from the task (run()).

⸻

💡 Real-World Use Case

Imagine a banking app:
	•	Thread "TransactionProcessor"
	•	Thread "NotificationSender"
	•	Naming threads helps in debugging when you have logs from different parts of your system.

⸻

 */