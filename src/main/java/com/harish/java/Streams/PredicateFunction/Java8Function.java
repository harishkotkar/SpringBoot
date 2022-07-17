package com.harish.java.Streams.PredicateFunction;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Java8Function {

    public static void main(String a[]) {
        example();
        example1();
        example2();
    }

    public static void example() {
        Function<String, String> toLowerCase = (s -> s.toLowerCase());

        String name = "HaRiSh";

        String lowerCaseName = toLowerCase.apply(name);

        System.out.println(lowerCaseName);
    }

    public static void example1() {
        BiFunction<String, String, String> joinString = (s1, s2) -> {
          return s1 + " : " + s2;
        };

        String result = joinString.apply("Name", "Harish Kotkar");
        System.out.println(result);

    }

    public static void example2() {

        BiFunction<Integer, Integer, Integer> f1 = (a, b) -> a + b;
        Function<Integer, Integer> f2 = a -> a * a;

        System.out.println(f1.andThen(f2).apply(10, 10));

    }


}
