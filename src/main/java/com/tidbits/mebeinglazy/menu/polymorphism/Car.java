package com.tidbits.mebeinglazy.menu.polymorphism;

public class Car {

    //runtime/dynamic poly

    public void getWheels(){
        System.out.println("6");
    }

    public void getSeatingCapacity(){
        System.out.println("5");
    }

    //compile Time/ Static Poly
    public void getBrandType(String brand, String type){
        System.out.println(brand + type);
    }

    public void getBrandType(String type){
        System.out.println(type);
    }


}
