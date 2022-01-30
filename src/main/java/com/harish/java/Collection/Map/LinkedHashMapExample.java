package com.harish.java.Collection.Map;// Java Program to Demonstrate Working of LinkedHashMap
  
// Importing required classes
import java.util.*;
  
// LinkedHashMapExample
public class LinkedHashMapExample {
  
    // Main driver method
    public static void main(String a[])
    {
  
        // Creating an empty LinkedHashMap
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
  
        // Adding entries in Map
        // using put() method
        lhm.put("one", "1");
        lhm.put("three", "3");
        lhm.put("four", "4");
        lhm.put("two", "2");
  
        // Printing all entries inside Map
        System.out.println(lhm);
  
        // Note: It prints the elements in same order
        // as they were inserted
  
        // Getting and printing value for a specic key
        System.out.println("Getting value for key 'one': "
                           + lhm.get("one"));
  
        // Getting size of Map using size() method
        System.out.println("Size of the map: "
                           + lhm.size());
  
        // Checking whether Map is empty or not
        System.out.println("Is map empty? "
                           + lhm.isEmpty());
  
        // Using containsKey() method to check for a key
        System.out.println("Contains key 'two'? "
                           + lhm.containsKey("two"));
  

  
        // Removing entry using remove() method
        System.out.println("delete element 'one': "
                           + lhm.remove("one"));
  
        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                           + lhm);
    }
}