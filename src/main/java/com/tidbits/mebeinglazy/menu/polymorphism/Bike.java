package com.tidbits.mebeinglazy.menu.polymorphism;

public class Bike extends Car{
    @Override
    public void getWheels(){
        System.out.println("2");
    }

    @Override
    public void getSeatingCapacity(){
        System.out.println("2");
    }
}
