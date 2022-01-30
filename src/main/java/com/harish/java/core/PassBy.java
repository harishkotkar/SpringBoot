package com.harish.java.core;


class UserClass {
    String name;
    int id;
    AddressClass address;

    public UserClass(String name, int id, AddressClass address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressClass getAddress() {
        return address;
    }

    public void setAddress(AddressClass address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}


class AddressClass {
    String city;
    int id;

    public AddressClass(String city, int id) {
        this.city = city;
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddressClass{" +
                "city='" + city + '\'' +
                ", id=" + id +
                '}';
    }
}

public class PassBy {

    public static void main(String[] args) {

        UserClass userClass = new UserClass("Harish",1, new AddressClass("Pune",1));
        System.out.println(userClass);

        transform(userClass);
        System.out.println(userClass);

        transformAddress(userClass.getAddress());
        System.out.println(userClass);

        Integer i = new Integer(11);
        System.out.println(i);
        transformVariable(i);
        System.out.println(i);

    }

    public static void transform(UserClass u) {
        u.setName("harry");
    }

    public static void transformAddress(AddressClass a) {
        a.setCity("Don");
    }

    public static void transformVariable(Integer i) {
      i = 555;
    }


}

