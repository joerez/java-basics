package com.joerezendes;

public class Main {

    public static void main(String[] args) {

        /* classes and objects */
        Fruit apple = new Fruit();
        apple.setName("Apple");
        apple.color = "Red";
        apple.sugarContent = 20;

        Fruit banana = new Fruit("Banana", 40, "yellow");
        banana.setTasty(true);

        /* INHERITANCE */
        Dog fluffy = new Dog();
        fluffy.eat();
        fluffy.run();

        fluffy.bark();

        Cat whiskers = new Cat();
        whiskers.run();
        whiskers.eat();

        whiskers.meow();

        /* STATIC KEYWORD */
        System.out.println(Animal.numAnimals);

        Animal rat = Animal.generateAnimal();
        System.out.println(Animal.numAnimals);

        rat.eat();
    }
}
