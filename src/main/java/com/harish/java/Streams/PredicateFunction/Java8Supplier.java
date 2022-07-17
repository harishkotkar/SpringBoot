package com.harish.java.Streams.PredicateFunction;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Java8Supplier {

    public static void main(String a[]) {
        example();
        example1();
    }

    public static void  example() {
        Supplier<String> consumer = () -> {
          return "harish";
        };

        String myName = consumer.get();
        System.out.println(myName);

     }

    public static void  example1() {

    }
}
