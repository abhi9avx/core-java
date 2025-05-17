package com.company;

// Thread class 1 - extending Thread
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My thread 1 is running");
            System.out.println("I am very happy");
            i++;
        }
    }
}

// Thread class 2 - extending Thread
class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My thread 2 is jumping");
            System.out.println("I am very sad");
            i++;
        }
    }
}

// Main class to run both threads
public class Thread_Concept {
    public static void main(String[] args) {
        // Create objects of both thread classes
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // Start both threads — they will run concurrently
        t1.start(); // Calls run() of MyThread1 in a new thread
        t2.start(); // Calls run() of MyThread2 in a new thread

        // NOTE: start() starts a new thread, calling run() directly won't do multithreading.
    }
}


/*
🧠 How it works (Behind the scenes)
	•	MyThread1 and MyThread2 are custom threads created by extending Thread.
	•	The run() method contains the task to be executed when the thread starts.
	•	In main(), we create objects of both classes and call start() on them.
	•	start() creates a new thread and calls run() asynchronously.
	•	This means t1 and t2 run in parallel, printing mixed output.

⚠️ Important Notes:
	•	Don’t call run() directly → it will run sequentially like a normal method.
	•	Always use start() to achieve true multithreading.
	•	Threads share memory — be careful when using shared data.
 */