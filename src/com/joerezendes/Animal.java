package com.joerezendes;

public class Animal {

    protected String species;
    public static int numAnimals = 0;

    public Animal() {
        numAnimals++;
    }

    public static Animal generateAnimal() {
        return new Animal();
    }

    public void run() {
        System.out.println(species + " is running");
    }

    public void eat() {
        System.out.println(species + " is eating something.");
    }

}
