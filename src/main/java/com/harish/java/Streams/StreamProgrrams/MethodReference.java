package com.harish.java.Streams.StreamProgrrams;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FunInterface {
    public void displayNum(int a);
}

class FunImpl {
    public void print(int num) {
        System.out.println("Num : "+num);
    }

    public static void printStatic(int num) {
        System.out.println("Num : "+num);
    }
}

public class MethodReference {
    public static void main(String args[]) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        List<Integer> number = List.of(1,4,5,3,6,2,7,3);

        //instance method
        number.stream().forEach(new FunImpl()::print);

        //static method
        number.stream().forEach(FunImpl::printStatic);

        //function interface - Assign implementation to custom function interface
        FunInterface printingInterface = (a) -> System.out.println(a);
        number.stream().forEach(printingInterface :: displayNum);
    }
}


