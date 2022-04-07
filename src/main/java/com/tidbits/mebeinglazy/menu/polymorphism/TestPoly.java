package com.tidbits.mebeinglazy.menu.polymorphism;


public class TestPoly {
    public static void main(String[] args) {
        Car car = new Bike();
        car.getBrandType("Hero");
        car.getBrandType("Hero","Hornet");
        car.getWheels();
        car.getSeatingCapacity();
       // Bike bike = (Bike) new Car(); //com.tidbits.mebeinglazy.menu.polymorphism.Car cannot be cast to com.tidbits.mebeinglazy.menu.polymorphism.Bike
        Car car1 = new Car();
        car1.getBrandType("Maruti");
        car1.getBrandType("Maruti","Zen");
        car1.getWheels();
        car1.getSeatingCapacity();

        //thread safe
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        stringBuilder.append("World");
        System.out.println(stringBuilder);

        //not thread safe
        StringBuffer stringBuffer = new StringBuffer("HelloWorld");
        System.out.println(stringBuffer);
        stringBuffer.append("From String Buffer");
        System.out.println(stringBuffer);
    }
}
