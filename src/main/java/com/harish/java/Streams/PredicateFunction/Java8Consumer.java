package com.harish.java.Streams.PredicateFunction;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Java8Consumer {

    public static void main(String a[]) {
        example();
        example1();
    }

    public static void  example() {
        Consumer<String> printer = s -> {
          System.out.println("Printing : " + s );
        };

        printer.accept("harish");

     }

    public static void  example1() {
        BiConsumer<String, String> printer = (s1, s2) -> {
            System.out.println("Printing : " + s1 + " - " + s2);
        };

        printer.accept("harish", "kotkar");
    }
}
