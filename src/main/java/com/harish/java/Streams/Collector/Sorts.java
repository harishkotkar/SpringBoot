package com.harish.java.Streams.Collector;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorts {

    public static void main(String args[]) {

        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("5");
        list.add("3");
        list.add("2");

        list = list.stream().sorted().collect(Collectors.toList());

        System.out.println(list);



        Map<String, Integer> map = new HashMap<>();
        map.put("3",3);
        map.put("5",5);
        map.put("1",1);
        map.put("2",2);
        map.put("4",4);

        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap())


    }

}
