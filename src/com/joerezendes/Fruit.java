package com.joerezendes;

public class Fruit {
    private String name;
    protected int sugarContent;
    public String color;
    private Boolean tasty;

    public Fruit() {

    }

    public Fruit(String name, int sugarContent, String color) {
        this.name = name;
        this.sugarContent = sugarContent;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boolean getTasty() {
        return tasty;
    }

    public void setTasty(Boolean tasty) {
        this.tasty = tasty;
    }
}
