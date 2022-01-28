package com.harish.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrograms {

    public static void main(String args[]) {
        print1();
    }

    //start with prefix 2
    public static void print1() {


        List<Integer> numbers = Arrays.asList(2,3,55,22,21,44,566,232,332,233,65,2222,3443,5432);

        numbers.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());



    }


}
