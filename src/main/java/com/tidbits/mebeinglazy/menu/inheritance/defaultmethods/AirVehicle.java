package com.tidbits.mebeinglazy.menu.inheritance.defaultmethods;

@FunctionalInterface
public interface AirVehicle {
    abstract int getWheels(String vehicle);
    default void getSeatingCapacity(int wheels){
        if (wheels ==6 ) {
            System.out.println("PLANE");
        }else if (wheels == 4){
            System.out.println("HELICOPTER");
        }
    }
}
