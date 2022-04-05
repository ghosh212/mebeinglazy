package com.tidbits.mebeinglazy.menu.inheritance.trial;

public class Dog implements Animal{
    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public String getSound() {
        return "woof";
    }

    public void getSpecies(){
        System.out.println("Animal");
    }
}
