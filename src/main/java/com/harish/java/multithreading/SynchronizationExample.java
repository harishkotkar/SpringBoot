package com.harish.java.multithreading;// Java Program Illustrating Lock the Object for
// the shared resource giving consistent output
  
// Class 1
// Helper class extending Thread class
public class SynchronizationExample extends Thread {
  
    // synchronized code
    // synchronized method will lock the object and
    // releases when thread is terminated or completed its
    // execution.
    synchronized public void printThread(int n)
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + n
                               + " is working...");
  
            try {
  
                // pause the execution of current  thread
                // for 600 millisecond
                Thread.sleep(600);
            }
            catch (Exception ex) {
                // overrides toString() method  and prints
                // exception if occur
                System.out.println(ex.toString());
            }
        }
        System.out.println("--------------------------");
        try {
  
            // pause the execution of current  thread for
            // 1000 millisecond
            Thread.sleep(1000);
        }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
// creating thread1 extending Thread Class
  
 class ThreadOne extends Thread {
  
    SynchronizationExample test;
    ThreadOne(SynchronizationExample p) { test = p; }
  
    public void run() // entry point for thread1
    {
  
        test.printThread(1);
    }
}
// creating thread2 extending Thread Class
  
 class ThreadTwo extends Thread {
  
    SynchronizationExample test;
    ThreadTwo(SynchronizationExample p) { test = p; }
    public void run() // entry point for thread2
    {
        test.printThread(2);
    }
}
  
 class SynchroTest {
  
    public static void main(String[] args)
    {
  
        SynchronizationExample p = new SynchronizationExample();
        
        // passing the same object of class PrintTest to
        // both threads
        ThreadOne t1 = new ThreadOne(p);
        ThreadTwo t2 = new ThreadTwo(p);
        
        // start function will execute the threads
        t1.start();
        t2.start();
    }
}