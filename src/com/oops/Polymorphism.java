package com.oops;

public class Polymorphism {
    public static void main(String[] args) {
        // try to do multiple things in multiple form 
        Calculator calc = new Calculator();

        calc.sum(5, 5);
        calc.sum(5.2f, 5.3f);
        calc.sum(1, 2, 3);
    }
}

// Method overloading - pre define polymorphism
// method overriding -  runtime polymorphism
class Calculator {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
