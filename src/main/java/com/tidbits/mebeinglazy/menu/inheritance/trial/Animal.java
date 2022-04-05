package com.tidbits.mebeinglazy.menu.inheritance.trial;

public interface Animal {

    int getLegs();
    String getSound();
    default void getSpecies(){
        System.out.println("Mammal");
    }

}
