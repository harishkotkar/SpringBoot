package com.harish.java.Streams;

import java.util.Arrays;
import java.util.List;

public class TestStreamPrograms {

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(2,3,55,22,21,44,566,232,332,233,65,2222,3443,5432);

        Integer a = numbers.stream().min((val1, val2) -> val1 > val2 ? 1 : -1).get();

        System.out.println(a);
    }
}
