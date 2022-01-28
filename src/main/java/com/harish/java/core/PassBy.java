package com.harish.java.core;

public class PassBy {


    public static void main(String... doYourBest) {
        Simpson simpson5 = new Simpson();
        System.out.println(simpson5.name);
        System.out.println(simpson5.sum);
        transformIntoHomer5(simpson5);
        transformIntoHomer5(simpson5,1,2);
        System.out.println(simpson5.name);
        System.out.println(simpson5.sum);

        System.out.println("-----------");

        String name1 = new String("Harish");
        System.out.println(name1);
        transformIntoHomer(name1);
        System.out.println(name1);

        System.out.println("-----------");

        int int1 = 1;
        System.out.println(int1);
        transformIntoHomer(int1);
        System.out.println(int1);

        System.out.println("-----------");
        Integer i = new Integer(11);
        System.out.println(i);
        transformIntoHomer(i);
        System.out.println(i);

        System.out.println("-----------");




    }

    static void transformIntoHomer(int int1) {
        int1 = 2;
    }

    static void transformIntoHomer(String name) {
        name = "aaaa";
    }

    static void transformIntoHomer(Integer number) {
        number = 1111;
    }


    static void transformIntoHomer5(Simpson simpson) {
        simpson.name = "Homer";
        Simpson simpson2 = new Simpson();
        simpson2.name = "kotkar";
        simpson = simpson2;

    }

    static void transformIntoHomer5(Simpson simpson, int a,int b) {
        simpson.sum = a+b;
    }

}

class Simpson {
    String name;
    int sum;
}