package com.op.properties.inheritance;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Box b0 = new Box();
        Box b1 = new Box(10,20,30);
        Box b2 = new Box(23);
        b0.display();
        b1.display();
        b2.display();

        BoxWeigth Box0 =  new BoxWeigth();
        BoxWeigth Box1 = new BoxWeigth(11,22,33,100);
        Box0.display();
        Box1.display();

        // SOMETHING NEW
        Box box5 =  new BoxWeigth(7,43,64,2);
        // now here is catch :  it is like  box5 object of Box (Box is parent) , and it refers to the new child;
        // now box5 can access the Box class properties -- bcz parent refer to the child (but he is parent that's why only parent class)
        // but cannot access BoxWeight class properties -- it cannot it is not the actual object of BoxWeight
        System.out.println("Box5 : "+box5.w);
        // System.out.println("Box5 : "+box5.weight); // give error
    }
}
