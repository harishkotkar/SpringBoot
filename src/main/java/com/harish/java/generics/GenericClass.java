package com.harish.java.generics;

public class GenericClass<T> {
   private T t;

   public GenericClass(T t) {
      this.t = t;
   }

   public GenericClass() {
   }

   public void add(T t) {
      this.t = t;
   }
   public T get() {
      return t;
   }
}

class GenericClassExample {

   public static void main(String[] args) {

      GenericClass<Integer> integerBox = new GenericClass<Integer>();
      GenericClass<String> stringBox = new GenericClass<String>();

      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());


      GenericClass<Integer> integerBox2 = new GenericClass<Integer>(new Integer(11));
      GenericClass<String> stringBox2 = new GenericClass<String>(new String("asdf"));

      System.out.printf("Integer Value :%d\n", integerBox2.get());
      System.out.printf("String Value :%s\n", stringBox2.get());


   }
}