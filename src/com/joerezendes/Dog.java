package com.joerezendes;

public class Dog extends Animal {
    public Dog() {
        this.species = "Dog";
    }

    public void bark() {
        System.out.println("bark bark");
    }

    public void eat() {
        System.out.println(this.species + " is chewing on a bone");
    }

}
