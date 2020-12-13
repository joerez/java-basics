package com.joerezendes;

public class Cat extends Animal{
    public Cat() {
        this.species = "Cat";
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println(this.species + " is eating a steak");
    }
}
