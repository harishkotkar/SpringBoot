package com.harish.java.Collection.apache;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class BidiMapTester {
   public static void main(String[] args) {
      BidiMap<String, String> bidi = new TreeBidiMap<>();
      
      bidi.put("One", "1");
      bidi.put("Two", "2");
      bidi.put("Three", "3");

      System.out.println(bidi.get("One"));
      System.out.println(bidi.getKey("1"));
      System.out.println("Original Map: " + bidi);
      
      bidi.removeValue("1");
      System.out.println("Modified Map: " + bidi);
      BidiMap<String, String> inversedMap = bidi.inverseBidiMap();
      System.out.println("Inversed Map: " + inversedMap);

      BidiMap<String, String> bidi2 = new TreeBidiMap<>();

      bidi2.put("One", "1");
      bidi2.put("Two", "1");
      bidi2.put("Three", "3");

      System.out.println(bidi2.getKey("1"));

      BidiMap<String, String> bidi3 = new TreeBidiMap<>();

      bidi3.put("One", "1");
      bidi3.put("One", "2");
      bidi3.put("Three", "3");

      System.out.println(bidi3.get("One"));


   }
}