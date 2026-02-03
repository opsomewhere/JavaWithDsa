package com.op.properties.inheritance;

public class BoxWeigth extends Box {
    double weight;

    public BoxWeigth() {
        this.weight =-1;
    }
    public BoxWeigth(double l, double h, double w, double weight) {
        super(l, h, w); // class the parent class constructor
        // used to initial the parent class constructor
        this.weight = weight;
    }

}
