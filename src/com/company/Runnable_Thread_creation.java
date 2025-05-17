package com.company;

// Step 1: Implement the Runnable interface instead of extending Thread
class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        // Task for thread 1
        System.out.println("I am thread1, not a threat 😄");
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        // Task for thread 2
        System.out.println("I am thread2, not a threat 😄");
    }
}

public class Runnable_Thread_creation {
    public static void main(String[] args) {

        // Step 2: Create objects of your Runnable classes (they represent your tasks)
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();

        // Step 3: Wrap each Runnable task in a Thread object (this is like loading bullets into a gun)
        Thread gun1 = new Thread(bullet1); // gun1 will run bullet1 (MyThreadRunnable1)
        Thread gun2 = new Thread(bullet2); // gun2 will run bullet2 (MyThreadRunnable2)

        // Step 4: Start both threads (fires the gun 🔫)
        gun1.start(); // This starts a new thread and calls bullet1.run()
        gun2.start(); // This starts a new thread and calls bullet2.run()
    }
}

/*

🧠 Explanation (Line by Line)
	•	implements Runnable → Allows your class to define a task that can run in a thread.
	•	Thread gun1 = new Thread(bullet1); → You wrap your task (bullet1) in a Thread object to execute it concurrently.
	•	gun1.start(); → Starts the thread, which internally calls run() of your Runnable class.

✅ Key Points:
	•	Runnable is best when your class already extends another class.
	•	Thread t = new Thread(Runnable r) → a common pattern in real-world applications.
	•	Always call start() to run the thread concurrently — never call run() directly unless testing.
 */