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
    }
}
