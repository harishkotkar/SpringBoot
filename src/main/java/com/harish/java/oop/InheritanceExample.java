package com.harish.java.oop;

class Parent {
    public int a =10;
    public int b =20;
    public int c =20;

    public String display() {
        return "Parent method";
    }

    public int sum(int i, int j) {
        System.out.println("Parent sum");
        return i+j;
    }

    public int method2(int i, int j) {
        System.out.println("Parent sum");
        return i+j;
    }

}

class Child extends Parent {
    int a =100;
    int b =200;

    public int sum(int i, int j) throws RuntimeException {
        System.out.println("Child sum");
        return i+j;
    }

    public String display() {
        return "child method";
    }

}



public class InheritanceExample {

    public static void main(String args[]) {
        Parent parent = new Parent();
        System.out.println("parent.a" + parent.a);
        System.out.println("parent.b"+parent.b);
        System.out.println(parent.display());

        Parent parentChild = new Child();
        System.out.println("parentChild.a" + parentChild.a);
        System.out.println("parentChild.b"+parentChild.b);
        System.out.println(parentChild.display());
        System.out.println(parentChild.c);

        Parent child = new Child();
        System.out.println("child.a" + child.a);
        System.out.println("child.b"+child.b);
        System.out.println(child.display());
        System.out.println(child.c);


    }

}