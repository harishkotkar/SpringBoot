package com.harish.java.Collection.Set;

import java.util.HashSet;
  
public class HashSetTest
{    
    public static void main(String args[]) 
    {
        // creating a HashSet
        HashSet hs = new HashSet();
          
        // adding elements to hashset
        // using add() method
        boolean b1 = hs.add("Geeks");
        boolean b2 = hs.add("GeeksforGeeks");
          
        // adding duplicate element
        boolean b3 = hs.add("Geeks");
          
        // printing b1, b2, b3
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
          
        // printing all elements of hashset
        System.out.println(hs);
              
    }
}