package com.tidbits.mebeinglazy.menu.inheritance.trial;

import com.tidbits.mebeinglazy.menu.inheritance.trial.Human;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Human human = new Human();

        System.out.println(dog.getLegs());
        System.out.println(dog.getSound());
        dog.getSpecies();
        System.out.println(human.getLegs());
        System.out.println(human.getSound());
        human.getSpecies();
    }
}

