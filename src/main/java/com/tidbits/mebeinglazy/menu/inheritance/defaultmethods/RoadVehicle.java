package com.tidbits.mebeinglazy.menu.inheritance.defaultmethods;

@FunctionalInterface
public interface RoadVehicle{

    abstract int getWheels(String vehicle);

    default void getSeatingCapacity(int wheels){
            if (wheels ==2 ) {
                System.out.println("BIKE");
            }else if (wheels == 4){
                    System.out.println("CAR");
                }
    }

}
