package com.oops;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // Single level inheritence
        Fish shark = new Fish();
        shark.eat();
        shark.swim();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}

 // Base Classs
class Animal1{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("Breating");
    }
}

//Derived class
class Fish extends Animal1{
    int fins;
    void swim(){
       System.out.println("swiming"); 
    }
}

// multilabel inheritance
// bese class - derive1 class - extended of derive class 
class Mammal extends Animal1{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

 // multiple derived class - hierarical inheritance

