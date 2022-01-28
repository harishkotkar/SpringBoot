package com.harish.java.Streams;

public class Harish {

    public static  void main(String args[]) {
            A a = new B();
            a.a();
    }
}

class A {
    public void a() {
        System.out.println("a");
    }
}

class B extends A{
    public void a() {

        System.out.println("aaa");
    }



}