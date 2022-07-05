package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat() {
        super("Tofu");
    }

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "meow!";
    }
}
