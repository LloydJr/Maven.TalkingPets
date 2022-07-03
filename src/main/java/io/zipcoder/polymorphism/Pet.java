package io.zipcoder.polymorphism;

public class Pet{

    private String name;
    private String speak;
    public Pet(){}
    public Pet(String name){
        this.name = name;
    }

    public String getName(){ return name; }

    public void setName(String next) { this.name = name; }

    public String speak() {
        this.speak = speak();
        return speak;
    }
}
