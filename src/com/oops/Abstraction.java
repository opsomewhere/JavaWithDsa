package com.oops;

public class Abstraction {
    public static void main(String[] args) {
    Horse h = new Horse();
    h.walk();
    h.eat();

    Chicken c = new Chicken();
    c.walk();
    c.eat();

    }
}
abstract class Animal{
    void eat(){
        System.out.println("Eating");  
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 leg");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 leg");
    }
}