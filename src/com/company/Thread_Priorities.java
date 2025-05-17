package com.company;

// Custom thread class that prints its name multiple times
class MyThr1 extends Thread {

    // Constructor to assign a custom thread name
    public MyThr1(String name) {
        super(name); // Calls Thread(String name) constructor
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am thread: " + this.getName());
            i++;
        }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        // Creating 6 threads with different names
        MyThr1 t1 = new MyThr1("abhinav - Min Priority");
        MyThr1 t2 = new MyThr1("abhinav2");
        MyThr1 t3 = new MyThr1("abhinav3");
        MyThr1 t4 = new MyThr1("abhinav4");
        MyThr1 t5 = new MyThr1("abhinav5");
        MyThr1 t6 = new MyThr1("abhinav6 - Most Important");

        // Setting priorities for selected threads
        t1.setPriority(Thread.MIN_PRIORITY);     // 1
        t6.setPriority(Thread.MAX_PRIORITY);     // 10
        // The others will run with default priority (5 - NORM_PRIORITY)

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}


/*

JVM define a range of teb logical priority for java thread
java.lang.Thread.MIN_PRIORITY = 1
java.lang.Thread.NORM_PRIORITY = 5
java.lang.Thread.MAX_PRIORITY = 10

📌 Thread Priority Notes (For Interviews / Revision)
	1.	✅ Priorities are hints to the scheduler — not strict rules.
	2.	✅ Threads with higher priority may run before or more frequently than lower ones.
	3.	❌ Don’t rely on priority alone for critical task control.
	4.	✅ Use priority when tasks have relative importance, but combine with proper synchronization and task design.

⸻

🚀 Real-World Analogy

Imagine threads as customers waiting in line at a bank:

	•	Thread with priority 10 is a VIP – they might be served faster.
	•	Thread with priority 1 is general public – they’ll wait longer.
	•	But in a busy branch (i.e., JVM + OS), everyone might wait a bit depending on availability (scheduler).
✅ Summary (Cheat Sheet)
	•	Thread t = new Thread("name") → names the thread.
	•	setPriority(int level) → sets its importance.
	•	start() → runs it on a separate thread.
	•	getName() → gets the thread’s name.
	•	getPriority() → checks its priority.
 */