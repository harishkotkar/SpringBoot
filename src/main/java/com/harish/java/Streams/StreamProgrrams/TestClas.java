package com.harish.java.Streams.StreamProgrrams;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClas {
    public static void main(String a[]) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        List<Integer> number = List.of(1,4,5,3,6,2,7,3);

        BiPredicate<String, String> isInitial = (s1,s2) ->  s1.equals(s2);
        Function<Integer, Integer> power = num1 -> num1*num1;

        System.out.println(power.apply(5));


        //String result = G7.stream().map(s -> s.toUpperCase()).collect(Collectors.joining("-"));
        //int result = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        //int result = number.stream().collect(Collectors.summingInt(Integer::intValue));
        //System.out.println(result);


//        Map<String, String> map = new HashMap<>();
//        map.put("a","A");
//        map.put("b","B");
//        map.put("c","C");
//        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " "+ entry.getValue()));

//        FunInterface i = new FunImpl()::print;
//        number.stream().forEach(n -> i.displayNum(n));

        number.stream().forEach(new FunImpl()::print);


    }

}


@FunctionalInterface
interface FunInterface {
    public void displayNum(int a);
}

class FunImpl {
    public void print(int num) {
        System.out.println("Num : "+num);
    }
}