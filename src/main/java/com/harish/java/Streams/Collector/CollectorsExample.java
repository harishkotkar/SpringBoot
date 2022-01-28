package com.harish.java.Streams.Collector;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Product{  
    int id;
    String name;
    int starRating;
    Long price;
      
    public Product(int id, String name, int starRating, Long price) {
        this.id = id;  
        this.name = name;  
        this.price = price;
        this.starRating = starRating;
    }  
    public int getId() {
        return id;
    }
    public int getStarRating() {
        return starRating;
    }
    public String getName() {
        return name;
    }  
    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starRating=" + starRating +
                ", price=" + price +
                '}';
    }
}
public class CollectorsExample {
    public static void main(String[] args) {
        List<Product>productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",3, 25000l));
        productsList.add(new Product(2,"Dell Laptop",3,30000l));
        productsList.add(new Product(3,"Lenevo Laptop",2,28000l));
        productsList.add(new Product(4,"Sony Laptop",4,48000l));
        productsList.add(new Product(5,"Apple Laptop",5,90000l));


        String str = "AABXSSS";
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        Map<Object, Long> mapas = chars.stream().collect(Collectors.groupingBy(c -> c.charValue(), Collectors.counting()));
        System.out.println(" grouping by char -> " + mapas);


        System.out.println("\n Ex. 1 count");
        Long noOfElements = productsList.stream()
                               .collect(Collectors.counting());  
        System.out.println(" Total elements : "+noOfElements);

        System.out.println("\n Ex. 2 SUM");
        Long sumOfElements = productsList.stream()
                .collect(Collectors.summingLong(p -> p.getPrice()));
        System.out.println(" Sum Of Elements : "+sumOfElements);

        System.out.println("\n Ex. 3 Avg");
        Double averagingDouble = productsList.stream()
                .collect(Collectors.averagingDouble(p -> p.getPrice()));
        System.out.println(" Averaging Double : "+averagingDouble);

        System.out.println("\n Ex. 4 groupingBy");
        Map<Object, Long> groupingByMap = new HashMap<Object, Long>();
        groupingByMap = productsList.stream().collect(Collectors.groupingBy(p-> p.getStarRating() , Collectors.counting()));
        System.out.println(" grouping by color -> " + groupingByMap);

        System.out.println("\n Ex. 5 partitioningBy");
        Map<Boolean, List<Product>> partitioningByMap = new HashMap<Boolean, List<Product>>();
        partitioningByMap = productsList.stream().collect(Collectors.partitioningBy(p -> p.getPrice() > 30000l, Collectors.toList()));
        System.out.println(" partitioning by age -> " + partitioningByMap);

        System.out.println("\n Ex. Collectors.toList() Example");
        List<String> namesList = productsList.stream()
                .map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println("Names List"+ namesList);

        System.out.println("\n Ex. Collectors.toUnmodifiableList() Example");
        List<String> unmodifiableList = productsList.stream()
                .map(e -> e.getName())
                .collect(Collectors.toUnmodifiableList());
        System.out.println(" Unmodifiable List"+ unmodifiableList);

        System.out.println("\n Ex. Collectors.toCollection() LinkedList Example");
        List<Product> linkedList = productsList.stream()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(" Names linked List"+ linkedList);

        System.out.println("\n Ex. Collectors.toSet() Example");
        Set<String> set = productsList.stream()
                .map(e -> e.getName())
                .collect(Collectors.toSet());
        System.out.println(" Names linked List"+ set);

        System.out.println("\n Ex. Collectors.toUnmodifiableSet() Example");
        Set<String> unmodifiableSet = productsList.stream().map(p -> p.getName())
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(" Names linked List"+ unmodifiableSet);

        System.out.println("\n Ex. Collectors.toCollection() HashSet Example");
        Set<String> hashSet = productsList.stream().map(p -> p.getName())
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("\n Ex. Collectors.toMap() Example");
        Map<String, Integer> map = productsList.stream()
                .collect(Collectors.toMap(p -> p.getName(), p -> p.getStarRating() ));
        map.entrySet().stream().forEach(a -> System.out.print( " "+ a + " |"));

        System.out.println("\n Ex. Collectors.filtering() Example");
        List<Product> filteredEmpList = productsList.stream()
                .collect(Collectors.filtering((Product e) -> e.getStarRating() > 3, Collectors.toList()));
        System.out.println(" Collectors.filtering() - filteredEmpList : " + filteredEmpList);

        System.out.println("\n Ex. Collectors.maxBy() and minBy Example");
        Comparator<Product> productComparator = (p1, p2) -> p1.getStarRating() - p2.getStarRating();
        Optional<Product> empMaxOptional = productsList.stream().collect(Collectors.maxBy(productComparator));
        if(empMaxOptional.isPresent()) {
            System.out.println(" Max rated Product : "+empMaxOptional.get().toString());
        }
        Predicate<Integer> pdsds = p -> p >10;
        Optional<Product> empMinOptional = productsList.stream().collect(Collectors.minBy(productComparator));
        if(empMaxOptional.isPresent()) {
            System.out.println(" Min rated Product : "+empMaxOptional.get().toString());
        }


        System.out.println("\n Ex. Collectors.summarizingDouble() () Example");
        DoubleSummaryStatistics doubleSummaryStatistics = productsList.stream().collect(Collectors.summarizingDouble((Product e) -> e.getStarRating()));
        System.out.println("Statistics summary on Product star Rating : "+ doubleSummaryStatistics);

        DoubleSummaryStatistics doubleSummaryStatisticsPrice = productsList.stream().collect(Collectors.summarizingDouble((Product e) -> e.getPrice()));
        System.out.println("Statistics summary on Product price : "+ doubleSummaryStatisticsPrice);


        System.out.println("\n Ex. Collectors.summarizingInt() Example");
        IntSummaryStatistics intSummaryStatistics = productsList.stream().collect(Collectors.summarizingInt((Product e) -> e.getStarRating()));
        System.out.println("Statistics summary on Product star Rating : "+ doubleSummaryStatistics);


        System.out.println("\n Ex. Collectors.summarizingLong() Example");
        LongSummaryStatistics longSummaryStatistics = productsList.stream().collect(Collectors.summarizingLong((Product e) -> e.getStarRating()));
        System.out.println("Statistics summary on Product star Rating : "+ doubleSummaryStatistics);

    }  
}  