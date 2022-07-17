package com.harish.java.Streams.PredicateFunction;

import java.util.function.Predicate;

public class Java8Predicate {
    public static void main(String args[]) {
        example1();
        example2();
        example3(10, (i) -> i > 7);
    }

    public static void example1() {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));
    }

    public static void example2() {

        // Creating predicate
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
    }



    public static void example3(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

}
