package com.tidbits.mebeinglazy.menu.inheritance.fi;

@FunctionalInterface
public interface Sum {

    //single abstract method
    //can have void,default methods
    abstract int getSum(int a, int b);
    default void display(String message){
        System.out.println("This is a functional interface implementation");
    }


}
