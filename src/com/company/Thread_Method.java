package com.company;

// Custom Thread 1
class MyNewThr1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Thread 1 running: " + this.getName());
            i++;
        }
    }
}

// Custom Thread 2
class MyNewThr2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Thread 2 running: " + this.getName());
            i++;
        }
    }
}

public class Thread_Method {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1(); // Thread 1
        MyNewThr2 t2 = new MyNewThr2(); // Thread 2

        // Start thread t1
        t1.start();

        try {
            // Main thread waits for t1 to finish before starting t2
            t1.join(); // 👈 This is the key concept here
        } catch (InterruptedException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Start thread t2 (only after t1 finishes)
        t2.start();
    }
}

/*

🔍 What Does join() Do?
	•	The join() method pauses the current thread (in this case, the main thread) until the target thread (t1) finishes execution.
	•	This is useful when you want one thread to complete before another one starts or continues.

⸻

🧠 Flow of Execution

Without join():
	•	Both threads (t1 and t2) may run simultaneously.

With t1.join():
	•	main() waits for t1 to finish all 40 iterations.
	•	Only after that, t2.start() is called.

⸻

💡 Real-life Analogy

You’re making tea ☕:

	•	Step 1: Boil water (Thread 1)
	•	Step 2: Add tea leaves only after water boils (Thread 2)
	•	join() ensures Step 2 waits for Step 1 to finish.

 */