package com.harish.springbootexample.model;

import java.util.Objects;

public class Customer {

    Integer id;
    String name;
    Address address;

    public Integer getId() {
        return id;
    }

    public Customer(Integer id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




}
