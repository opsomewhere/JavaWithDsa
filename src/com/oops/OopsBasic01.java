package com.oops;

public class OopsBasic01 {
    public static void main(String[] args) {
        //created an pen object 
        pen p1 = new pen();// Constractor  
        p1.setcolor("blue"); // selector 
        System.out.println(p1.getColor());

        p1.setTip(15);
        System.out.println(p1.gettip());
        System.out.println();
    }
}

class pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setcolor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
