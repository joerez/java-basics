package com.joerezendes;

public class Dog extends Animal implements ITalkAble {
    public Dog() {
        this.species = "Dog";
    }

    public void bark() {
        System.out.println("bark bark");
    }

    public void eat() {
        System.out.println(this.species + " is chewing on a bone");
    }

    @Override
    public void Talk() {
        System.out.println("This Dog really likes you.");
    }
}
