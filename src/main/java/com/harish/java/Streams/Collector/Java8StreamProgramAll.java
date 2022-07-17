package com.harish.java.Streams.Collector;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StreamProgramAll {

    public static void main(String args[]) {
        List<Emp> empList = new ArrayList<>();

        empList.add(new Emp(100, "AAA", 30, "Dept1", 30000));
        empList.add(new Emp(101, "BBB", 31, "Dept1", 40000));
        empList.add(new Emp(102, "CCC", 32, "Dept2", 35000));
        empList.add(new Emp(103, "DDD", 30, "Dept2", 45000));
        empList.add(new Emp(104, "EEE", 31, "Dept4", 40000));
        empList.add(new Emp(105, "FFF", 32, "Dept4", 50000));


        // extractDetailsToCollection(empList);
        
        // operationOnFieldData(empList);

        // groupingOfData(empList);

        // filtering(empList);

        // interviewQuestions(empList);


    }

    private static void filtering(List<Emp> empList) {
        // Collectors.filtering() Example
        List<Emp> filteredEmpList1 = empList.stream()
                .collect(Collectors.filtering((Emp e) -> e.getAge() > 30, Collectors.toList()));
        System.out.println("Collectors.filtering() - filteredEmpList : " + filteredEmpList1);

        //OR
        List<Emp> filteredEmpList2 = empList.stream().filter(e -> e.getAge() >  30).collect(Collectors.toList());
        System.out.println("Collectors.filtering() - filteredEmpList : " + filteredEmpList2);
    }

    private static void interviewQuestions(List<Emp> empList) {

        //to print min and max salary from each department.
        Optional<Emp> minEmp = empList.stream().min(Comparator.comparingInt(Emp::getAge));
        System.out.println(minEmp);

        Optional<Emp> maxEmp = empList.stream().max(Comparator.comparingInt(Emp::getAge));
        System.out.println(maxEmp);


        //to print the max salary of an employee from each department.
        Map<String, Optional<Emp>> filteredEmpList3 = empList.stream().collect(Collectors.groupingBy(e -> e.getDept(),
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Emp::getSal)))));
        System.out.println("Collectors.filtering() - filteredEmpList : " + filteredEmpList3);



    }

    private static void groupingOfData(List<Emp> empList) {
        // Collectors.groupingBy() Example
        Map<String, List<Emp>> groupByRegion = empList.stream()
                .collect(Collectors.groupingBy((Emp e) -> e.getDept()));
        System.out.println("groupByRegion :: " + groupByRegion);

        // groupingBy for set.
        Map<String, Set<Emp>> groupByRegionSet = empList.stream()
                .collect(Collectors.groupingBy((Emp e) -> e.getDept(), Collectors.toSet()));
        System.out.println("groupByRegionSet :: " + groupByRegionSet);


        // Collectors.partitioningBy() Example
        Map<Boolean, List<Emp>> partitionByAge = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        System.out.println("partitionByAge :: " + partitionByAge);

        // Set as Map value
        Map<Boolean, Set<Emp>> partitionByAgeSet = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30, Collectors.toSet()));
        System.out.println("partitionByAge :: " + partitionByAgeSet);

        // LinkedList as Map value
        Map<Boolean, LinkedList<Emp>> partitionByAgeLinedList = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30, Collectors.toCollection(LinkedList::new)));
        System.out.println("partitionByAge :: " + partitionByAgeLinedList);
    }

    private static void operationOnFieldData(List<Emp> empList) {
        // Collector.summingInt() Example
        int sumOfEmpIds = empList.stream().collect(Collectors.summingInt((Emp e) -> e.getId()));
        System.out.println("Collectors.summingInt : " + sumOfEmpIds);
        
        // Collector.summingDouble() Example
        double sumOfEmpSalss = empList.stream().collect(Collectors.summingDouble((Emp e) -> e.getSal()));
        System.out.println("Collectors.summingDouble : " + sumOfEmpSalss);

        // Collectors.averagingInt() / averagingLong() / averagingDouble() Examples
        double avgOfEmpSalss = empList.stream().collect(Collectors.averagingDouble((Emp e) -> e.getSal()));
        System.out.println("Collectors.averagingDouble avg sal: " + avgOfEmpSalss);

        // Collectors.counting() Example
        long count = empList.stream().collect(Collectors.counting());
        System.out.println("Collectors.counting() : Count : " + count);

        // Collectors.joining() Example
        String joinedStr = empList.stream().map(e -> e.getName()).collect(Collectors.joining());
        System.out.println("joinedStr by using joining() method : " + joinedStr);

        String joinedDelimiterStr = empList.stream().map(e -> e.getName()).collect(Collectors.joining(" * "));
        System.out.println("joinedDelimiterStr by using joining(Delimiter) method : " + joinedDelimiterStr);

        String joinePrePostStr = empList.stream().map(e -> e.getName()).collect(Collectors.joining("*", "@", "|"));
        System.out.println("joinePrePostStr by using joining(Delimiter) method : " + joinePrePostStr);
    }

    private static void extractDetailsToCollection(List<Emp> empList) {
        // Collectors.toList() Example
        List<String> namesList = empList.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(namesList);

        // Collectors.toSet() Example
        Set<String> regionSet = empList.stream().map(e -> e.getDept()).collect(Collectors.toSet());
        System.out.println(regionSet);

        // Collectors.toUnmodifiableSet() Example
        Set<Double> unmodifiableSet = empList.stream().map(e -> e.getSal()).collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiableSet);

        // Collectors.toMap() Example
        Map<Integer, Emp> empMap = empList.stream().collect(Collectors.toMap((e) -> e.getId(), Function.identity()));
        System.out.println(empMap);

        Map<Integer, Emp> empDupMap = empList.stream().collect(Collectors.toMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empDupMap);

        // Collectors.toUnmodifiableMap() Example
        Map<Integer, Emp> empUnmodifiedMap = empList.stream().collect(Collectors.toMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empUnmodifiedMap);

    }


}


class Emp {
    private int id;
    private String name;
    private int age;
    private String dept;
    private double sal;

    public Emp(int id, String name, int age, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", sal=" + sal +
                '}';
    }
}