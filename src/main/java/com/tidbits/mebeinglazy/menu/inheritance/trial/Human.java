package com.tidbits.mebeinglazy.menu.inheritance.trial;

public class Human implements Animal{
    @Override
    public int getLegs() {
        return 2;
    }

    @Override
    public String getSound() {
        return "Hi there!!";
    }

    //over rides the default method in interface
    @Override
    public void getSpecies() {
        Animal.super.getSpecies();
    }
}
