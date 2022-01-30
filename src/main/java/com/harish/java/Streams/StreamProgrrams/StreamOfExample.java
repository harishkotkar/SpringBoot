package com.harish.java.Streams.StreamProgrrams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfExample {

    public static void main(String args[]) {

        List<Integer> listOfInt = List.of(4,1,8,3,0,5,2,6,7,9);

        Optional<Integer> first = findFirst(listOfInt);
        System.out.println("first = " +first.get());

        int min = findMin(listOfInt);
        System.out.println("Min = " +min);

        int max = findMax(listOfInt);
        System.out.println("max = " +max);

        int sum = findSum(listOfInt);
        System.out.println("sum = " +sum);

        List<Integer> even = findEven(listOfInt);
        System.out.println("even = " +even);

        List<Integer> listOfInt2 = List.of(14,21,18,33,60,15,2,46,67,89);
        List<Integer> startWithOne = startWithOne(listOfInt2);
        System.out.println("startWithOne = " +startWithOne);

        List<Integer> listOfInt3 = List.of(4,1,8,3,0,5,2,6,7,9,1,5,9);
        List<Integer> duplicates = findDuplicates(listOfInt3);
        System.out.println("duplicates = " +duplicates);


        Map<Integer, Long> occurrences = findOccurrences(listOfInt3);
        System.out.println("occurrences = " +occurrences);







//        String[] languages = {"Java", "Python", "JavaScript"};
//        Stream.of(languages).forEach(System.out::println);
//
//        List<String> languages1 = new LinkedList<>(Arrays.asList("11","22"));
//        Stream.of(languages1).forEach(System.out::println);
//
//        List<String> languages2 = List.of("11","22");
//        Stream.of(languages2).forEach(System.out::println);

    }

    private static Optional<Integer> findFirst(List<Integer> listOfInt) {
        return listOfInt.stream().findFirst();
    }

    private static Map<Integer,Long> findOccurrences(List<Integer> listOfInt3) {
        return listOfInt3.stream().collect(Collectors.groupingBy(integer -> integer.intValue(), Collectors.counting()));
    }

    private static List<Integer> findDuplicates(List<Integer> listOfInt3) {
        Set<Integer> set = new HashSet();
        return listOfInt3.stream().collect(Collectors.filtering(e -> !set.add(e), Collectors.toList()));
    }

    private static int findMin(List<Integer> listOfInt) {
        return listOfInt.stream().min((o1, o2) -> o1.compareTo(o2)).get();
    }

    private static int findMax(List<Integer> listOfInt) {
        return listOfInt.stream().min((o1, o2) -> o2.compareTo(o1)).get();
    }

    private static int findSum(List<Integer> listOfInt) {
        return listOfInt.stream().collect(Collectors.summingInt(e -> e.intValue()));
    }

    private static List<Integer> findEven(List<Integer> listOfInt) {
        return listOfInt.stream().collect(Collectors.filtering(e -> e%2 == 0, Collectors.toList()));
    }

    private static List<Integer> startWithOne(List<Integer> listOfInt) {
        return listOfInt.stream().map(s -> s.toString()).collect(Collectors.filtering(e -> e.startsWith("1"), Collectors.toList())).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
    }

}
