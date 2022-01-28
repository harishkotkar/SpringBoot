package com.harish.java.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String args[]) {
        test();
        streamWithCustomObject();
    }

    public static void test() {
        List<Integer> empIds =  new ArrayList<>();
        empIds.add(1);
        empIds.add(4);
        empIds.add(2);
        empIds.add(8);
        empIds.add(3);
        empIds.add(1);
        empIds.add(2);


        //Stream functions

        //distinct
        System.out.println(empIds.stream().distinct().collect(Collectors.toList()));

        //count of elements
        System.out.println(empIds.stream().count());

        //iterate to limited elements
        System.out.println(empIds.stream().limit(2).count());

        //all elements match condition?
        System.out.println(empIds.stream().allMatch(a-> a<10));

        //any element matches condition?
        System.out.println(empIds.stream().anyMatch(a-> a<5));

        //sort elements
        System.out.println(empIds.stream().sorted().collect(Collectors.toList()));

        System.out.println(empIds.stream().toArray());

        //min
        System.out.println(empIds.stream().min((a,b) -> a>b?1:-1) .get());

        //max
        System.out.println(empIds.stream().max((a,b) -> a>b?1:-1) .get());

    }

    public static void streamWithCustomObject() {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list

        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));


        //min
        System.out.println( productsList.stream().min((p1,p2) -> p1.id > p2.id ? 1:-1).get().id);

        //max
        System.out.println( productsList.stream().min((p1,p2) -> p1.id > p2.id ? 1:-1).get().id);

        // Converting Product List into a Map
        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println(productPriceMap);


        List<Float> productPriceList =
                productsList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);

    }

}
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}