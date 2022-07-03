package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog() {
        super("Yuki");
    }
    public Dog(String name){
        super(name);
    }
    public String speak(){
        return "Arf";
    }
}
