package com.harish.java.multithreading;

// Class 1
// Helper class
// Extending Thread class
public class SynchronizationExample1 extends Thread {
  
    // Non synchronized Code
  
    // Method 1
    public void printThread(int n)
    {
  
        // This loop will print the  currently executed
        // thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + n
                               + " is working...");
  
            // Try block to check for exceptions
            try {
  
                // Pause the execution of current thread
                // for 0.600 seconds using sleep() method
                Thread.sleep(600);
            }
  
            // Catch block to handle the exceptions
            catch (Exception ex) {
  
                // Overriding existing toString() method and
                // prints exception if occur
                System.out.println(ex.toString());
            }
        }
  
        // Display message for better readability
        System.out.println("--------------------------");
  
        try {
  
            // Pause the execution of current  thread
            // for 0.1000 millisecond or 1sec using sleep
            // method
            Thread.sleep(1000);
        }
  
        catch (Exception ex) {
  
            // Printing the exception
            System.out.println(ex.toString());
        }
    }
}
  
// Class 2
// Helper class extending Thread Class
 class Thread1 extends Thread {
  
    // Declaring variable of type Class1
    SynchronizationExample1 test;
  
    // Constructor for class1
    Thread1(SynchronizationExample1 p) { test = p; }
  
    // run() method of this class for
    // entry point for thread1
    public void run()
    {
  
        // Calling method  1 as in above class
        test.printThread(1);
    }
}
  
// Class 3
// Helper class extending Thread Class
 class Thread2 extends Thread {
  
    // Declaring variable of type Class1
    SynchronizationExample1 test;
  
    // Constructor for class2
    Thread2(SynchronizationExample1 p) { test = p; }
  
    // run() method of this class for
    // entry point for thread2
    public void run() { test.printThread(2); }
}
  
// Class 4
// Main class
 class SynchroTest1 {
  
    // Main driver method
    public static void main(String[] args)
    {
  
        // Creating object of class 1 inside main() method
        SynchronizationExample1 p = new SynchronizationExample1();
  
        // Passing the same object of class SynchronizationExample1 to
        // both threads
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);
  
        // Start executing the threads
        // using start() method
        t1.start();
        t2.start();
  
        // This will print both the threads  simultaneously
    }
}