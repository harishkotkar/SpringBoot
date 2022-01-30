package com.harish.java.Collection.Queue;

import java.util.*;
  
public class DequeExample {
    public static void main(String[] args)
    {
        Deque<String> deque
            = new LinkedList<String>();
  
        // We can add elements to the queue
        // in various ways
  
        // Add at the last
        deque.add("Element 1");
        System.out.println(deque);
        // Add at the first
        deque.addFirst("Element 2 ");
        System.out.println(deque);
  
        // Add at the last
        deque.addLast("Element 3 ");
        System.out.println(deque);
  
        // Add at the first
        deque.push("Element 4 ");
        System.out.println(deque);
  
        // Add at the last
        deque.offer("Element 5 ");
        System.out.println(deque);
  
        // Add at the first
        deque.offerFirst("Element 6");
        System.out.println(deque);

  
        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing "
                           + "first and last: "
                           + deque);
    }
}